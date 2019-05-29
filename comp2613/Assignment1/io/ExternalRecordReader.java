/**
 * Project: Assignment1_start
 * File: ExternalRecordReader.java
 * Date: May 28, 2019
 * Time: 6:52:40 PM
 */
package a00964363.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import a00964363.book.ApplicationException;
import a00964363.data.Book;
import a00964363.data.Customer;
import a00964363.data.Purchase;
import a00964363.util.Validator;

/**
 * @author Mike Bird, A00964363
 *
 */
public class ExternalRecordReader {

	public static final String FIELD_DELIMITER = "\\|";

	private static final Logger LOG = LogManager.getLogger();

	/**
	 * private constructor to prevent instantiation
	 */
	private ExternalRecordReader() {

	}

	/*
	 * Read customer file
	 * @param data
	 * Date file provided for customers
	 * @return List of customers
	 * @throws Application Exception
	 */
	public static List<Customer> readCustomerFile(File customerDataFile) throws ApplicationException {
		BufferedReader customerReader = null;
		List<Customer> customers = new ArrayList<>();
		LOG.debug("Reading" + customerDataFile.getAbsolutePath());
		try {
			customerReader = new BufferedReader(new FileReader(customerDataFile));

			String line = null;
			line = customerReader.readLine(); // skip the header line
			while ((line = customerReader.readLine()) != null) {
				Customer customer = readCustomerString(line);
				customers.add(customer);
				LOG.debug("Added " + customer.toString() + " as " + customer.getCustomerID());
			}
		} catch (IOException e) {
			LOG.error(e.getMessage());
			throw new ApplicationException(e.getMessage());
		} finally {
			try {
				if (customerReader != null) {
					customerReader.close();
				}
			} catch (IOException e) {
				LOG.error(e.getMessage());
				throw new ApplicationException(e.getMessage());
			}
		}

		return customers;
	}

	/**
	 * Parse a Customer data string into a Customer object;
	 * 
	 * @param row
	 * @throws ApplicationException
	 */
	private static Customer readCustomerString(String data) throws ApplicationException {
		String[] elements = data.split(FIELD_DELIMITER);
		if (elements.length != Customer.ATTRIBUTE_COUNT) {
			throw new ApplicationException(
					String.format("Expected %d but got %d: %s", Customer.ATTRIBUTE_COUNT, elements.length, Arrays.toString(elements)));
		}

		int index = 0;
		long id = Integer.parseInt(elements[index++]);
		String firstName = elements[index++];
		String lastName = elements[index++];
		String street = elements[index++];
		String city = elements[index++];
		String postalCode = elements[index++];
		String phone = elements[index++];
		// should the email validation be performed here or in the customer class? I'm leaning towards putting it here.
		String emailAddress = elements[index++];
		if (!Validator.validateEmail(emailAddress)) {
			throw new ApplicationException(String.format("Invalid email: %s", emailAddress));
		}
		String yyyymmdd = elements[index];
		if (!Validator.validateJoinedDate(yyyymmdd)) {
			throw new ApplicationException(String.format("Invalid joined date: %s for customer %d", yyyymmdd, id));
		}
		int year = Integer.parseInt(yyyymmdd.substring(0, 4));
		int month = Integer.parseInt(yyyymmdd.substring(4, 6));
		int day = Integer.parseInt(yyyymmdd.substring(6, 8));

		return new Customer.Builder(id, phone).setFirstName(firstName).setLastName(lastName).setStreet(street).setCity(city).setPostalCode(postalCode)
				.setEmailAddress(emailAddress).setJoinedDate(year, month, day).build();
	}

	/*
	 * Read book file
	 * @param data
	 * Date file provided for books
	 * @return List of books
	 * @throws Application Exception
	 */
	public static List<Book> readBookFile(File bookDataFile) throws ApplicationException {
		BufferedReader bookReader = null;
		List<Book> books = new ArrayList<>();
		LOG.debug("Reading" + bookDataFile.getAbsolutePath());
		try {
			bookReader = new BufferedReader(new FileReader(bookDataFile));

			String line = null;
			line = bookReader.readLine(); // skip the header line
			while ((line = bookReader.readLine()) != null) {
				Book book = readBookString(line);
				books.add(book);
				LOG.debug("Added " + book.toString() + " as " + book.getBookID());
			}
		} catch (IOException e) {
			LOG.error(e.getMessage());
			throw new ApplicationException(e.getMessage());
		} finally {
			try {
				if (bookReader != null) {
					bookReader.close();
				}
			} catch (IOException e) {
				LOG.error(e.getMessage());
				throw new ApplicationException(e.getMessage());
			}
		}

		return books;
	}

	/**
	 * Parse a Book data string into a Book object;
	 * 
	 * @param row
	 * @throws ApplicationException
	 */
	private static Book readBookString(String data) throws ApplicationException {
		String[] elements = data.split(FIELD_DELIMITER);
		if (elements.length != Book.ATTRIBUTE_COUNT) {
			throw new ApplicationException(
					String.format("Expected %d but got %d: %s", Book.ATTRIBUTE_COUNT, elements.length, Arrays.toString(elements)));
		}

		int index = 0;
		long bookID = Integer.parseInt(elements[index++]);
		String isbn = elements[index++];
		String author = elements[index++];
		String originalPublicationYear = elements[index++];
		String originalTitle = elements[index++];
		double averageRating = Double.parseDouble(elements[index++]);
		int ratingsCount = Integer.parseInt(elements[index++]);
		String imageURL = elements[index++];

		return new Book.Builder(bookID, isbn).setAuthor(author).setOriginalPublicationYear(originalPublicationYear).setOriginalTitle(originalTitle)
				.setAverageRating(averageRating).setRatingsCount(ratingsCount).setImageURL(imageURL).build();
	}

	/*
	 * Read Purchase file
	 * @param data
	 * Date file provided for Purchases
	 * @return List of Purchases
	 * @throws Application Exception
	 */
	public static List<Purchase> readPurchaseFile(File purchaseDataFile) throws ApplicationException {
		BufferedReader purchaseReader = null;
		List<Purchase> purchases = new ArrayList<>();
		LOG.debug("Reading" + purchaseDataFile.getAbsolutePath());
		try {
			purchaseReader = new BufferedReader(new FileReader(purchaseDataFile));

			String line = null;
			line = purchaseReader.readLine(); // skip the header line
			while ((line = purchaseReader.readLine()) != null) {
				Purchase purchase = readPurchaseString(line);
				purchases.add(purchase);
				LOG.debug("Added " + purchase.toString() + " as " + purchase.getBookID());
			}
		} catch (IOException e) {
			LOG.error(e.getMessage());
			throw new ApplicationException(e.getMessage());
		} finally {
			try {
				if (purchaseReader != null) {
					purchaseReader.close();
				}
			} catch (IOException e) {
				LOG.error(e.getMessage());
				throw new ApplicationException(e.getMessage());
			}
		}

		return purchases;
	}

	/**
	 * Parse a Purchase data string into a Purchase object;
	 * 
	 * @param row
	 * @throws ApplicationException
	 */
	private static Purchase readPurchaseString(String data) throws ApplicationException {
		String[] elements = data.split(FIELD_DELIMITER);
		if (elements.length != Purchase.ATTRIBUTE_COUNT) {
			throw new ApplicationException(
					String.format("Expected %d but got %d: %s", Purchase.ATTRIBUTE_COUNT, elements.length, Arrays.toString(elements)));
		}

		int index = 0;
		long id = Integer.parseInt(elements[index++]);
		long customerID = Integer.parseInt(elements[index++]);
		long bookID = Integer.parseInt(elements[index++]);
		double price = Double.parseDouble(elements[index++]);

		return new Purchase(id, customerID, bookID, price);
	}
}
