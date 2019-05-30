/**
 * Project: Assignment1_start
 * File: Assignment1.java
 * Date: May 28, 2019
 * Time: 8:59:50 PM
 */
package a00964363;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

import a00964363.book.ApplicationException;
import a00964363.data.Book;
import a00964363.data.Customer;
import a00964363.data.Purchase;
import a00964363.io.ExternalRecordReader;
import a00964363.io.ReportOutput;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Assignment1 {

	private static final String CUSTOMER_DATA_FILENAME = "customers.dat";
	private static final String BOOK_DATA_FILENAME = "books500.csv";
	private static final String PURCHASE_DATA_FILENAME = "purchases.csv";
	private static final String LOG4J_CONFIG_FILENAME = "log4j2.xml";

	static {
		configureLogging();
	}

	private static final Logger LOG = LogManager.getLogger();

	private List<Customer> customers;
	private List<Book> books;
	private List<Purchase> purchases;
	private File customerDataFile;
	private File purchaseDateFile;
	private File bookDataFile;

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		Instant startTime = Instant.now();

		LOG.info(startTime);
		//
		// must check and load all three files!!!!
		//
		File customerFile = new File(CUSTOMER_DATA_FILENAME);
		if (!customerFile.exists()) {
			System.out.format("Required '%s' is missing.", CUSTOMER_DATA_FILENAME);
			System.exit(-1);
		}
		File bookFile = new File(BOOK_DATA_FILENAME);
		if (!bookFile.exists()) {
			System.out.format("Required '%s' is missing.", BOOK_DATA_FILENAME);
			System.exit(-1);
		}

		new Assignment1(customerFile, bookFile).run();

		Instant endTime = Instant.now();
		LOG.info(endTime);
		LOG.info(String.format("Duration: %d ms", Duration.between(startTime, endTime).toMillis()));
	}

	private static void configureLogging() {
		ConfigurationSource source;
		try {
			source = new ConfigurationSource(new FileInputStream(LOG4J_CONFIG_FILENAME));
			Configurator.initialize(null, source);
		} catch (IOException e) {
			LOG.error(String.format("Can't find the log4j logging configuration file %s.", LOG4J_CONFIG_FILENAME));
		}
	}

	/*
	 * Assignment 1 constructor
	 */
	public Assignment1(File customerDataFile, File bookDataFile) {
		LOG.debug("Assignment1()");
		//
		// Does this name have to be changed (customerDataFile???) will it work with all three different objects?
		//
		this.customerDataFile = customerDataFile;
		this.bookDataFile = bookDataFile;
	}

	/*
	 * Populate the customers and print them out
	 */
	private void run() {
		LOG.debug("run();");
		try {
			loadCustomers();
			// printCustomers();
		} catch (ApplicationException e) {
			LOG.error(e.getMessage());
		}
		try {
			loadBooks();
			printBooks();
		} catch (ApplicationException e) {
			LOG.error(e.getMessage());
		}
	}

	private void loadCustomers() throws ApplicationException {
		LOG.debug(String.format("Reading the Customers Report from '%s'", customerDataFile.getAbsolutePath()));
		customers = ExternalRecordReader.readCustomerFile(customerDataFile);
	}

	private void loadBooks() throws ApplicationException {
		LOG.debug(String.format("Reading the Customers Report from '%s'", bookDataFile.getAbsolutePath()));
		//error located here...
		//books is of type <Book> - readBookFile returns type <String>
		// fixing problem for poorly designed program...bam bam bam...
		books = ExternalRecordReader.readBookFile(bookDataFile);
	}

	private void printCustomers() {
		File customersFile = new File("customers_report.txt");
		LOG.debug(String.format("Writing the Customers Report to '%s'", customersFile.getAbsolutePath()));
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream(customersFile));
			ReportOutput.writeCustomer(customers, out);
		} catch (FileNotFoundException e) {
			LOG.error(e.getMessage());
		}
	}

	private void printBooks() {
		File booksFile = new File("book_report.txt");
		LOG.debug(String.format("Writing the Book Report to '%s'", booksFile.getAbsolutePath()));
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream(booksFile));
			ReportOutput.writeBook(books, out);
		} catch (FileNotFoundException e) {
			LOG.error(e.getMessage());
		}
	}

}
