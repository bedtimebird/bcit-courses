/**
 * Project: Assignment1_start
 * File: ReportOutput.java
 * Date: May 28, 2019
 * Time: 8:19:28 PM
 */
package a00964363.io;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import a00964363.data.Book;
import a00964363.data.Customer;
import a00964363.data.Purchase;
import a00964363.util.Common;

/**
 * @author Mike Bird, A00964363
 *
 */
public class ReportOutput {

	public static final String HORIZONTAL_LINE = "----------------------------------------------------------------------------------------------------------------------------------------------";

	public static final String CUSTOMER_HEADER_FORMAT = "%3s. %-6s %-12s %-12s %-25s %-12s %-12s %-15s %-25s%s";
	public static final String CUSTOMER_FORMAT = "%3d. %06d %-12s %-12s %-25s %-12s %-12s %-15s %-25s%s";

	public static final String BOOK_HEADER_FORMAT = "%08d %-12s %-40s %-40s %4d %6.3f %13d %-60s";
	public static final String BOOK_FORMAT = "%08d %-12s %-40s %-40s %4d %6.3f %13d %-60s";

	public static final String PURCHASE_HEADER_FORMAT = "%-24s %-80s $%.2f";
	public static final String PURCHASE_FORMAT = "%-24s %-80s $%.2f";

	private static final Logger LOG = LogManager.getLogger();

	/*
	 * private constructor to prevent instantiation
	 */
	private ReportOutput() {

	}

	/*
	 * Create report of Customer from Customer List
	 * @params customers
	 */
	public static void writeCustomer(List<Customer> customers, PrintStream out) {
		String text = null;
		println("Customers Report", out);
		println(HORIZONTAL_LINE, out);
		text = String.format(CUSTOMER_HEADER_FORMAT, "#", "ID", "First name", "Last name", "Street", "City", "Postal Code", "Phone", "Email",
				"Join Date");
		println(text, out);
		println(HORIZONTAL_LINE, out);

		int i = 0;
		for (Customer customer : customers) {
			LocalDate date = customer.getJoinedDate();
			text = String.format(CUSTOMER_FORMAT, ++i, customer.getCustomerID(), customer.getFirstName(), customer.getLastName(),
					customer.getStreet(), customer.getCity(), customer.getPostalCode(), customer.getPhone(), customer.getEmailAddress(),
					Common.DATE_FORMAT.format(date));
			println(text, out);
		}
	}

	/*
	 * Create report of Book from Book List
	 */
	public static void writeBook(List<Book> books, PrintStream out) {
		String text = null;
		println("Books Report", out);
		println(HORIZONTAL_LINE, out);
		text = String.format(BOOK_HEADER_FORMAT, "#", "ID", "ISBN", "Author", "Original Title", "Original Publication Year", "Average Rating",
				"Ratings Count", "Image URL");
		println(text, out);
		println(HORIZONTAL_LINE, out);
		int i = 0;
		for (Book book : books) {
			text = String.format(BOOK_FORMAT, ++i, book.getBookID(), book.getIsbn(), book.getAuthor(), book.getOriginalTitle(),
					book.getOriginalPublicationYear(), book.getAverageRating(), book.getRatingsCount(), book.getImageURL());

		}
	}

	/*
	 * Create report of Purchase from Purchase List
	 */
	public static void writePurchase(List<Purchase> purchases, PrintStream out) {
		String text = null;
		println("Purchase Report", out);
		println(HORIZONTAL_LINE, out);
		text = String.format(PURCHASE_HEADER_FORMAT, "Name", "Title", "Price");
		println(text, out);
		println(HORIZONTAL_LINE, out);

		for (Purchase purchase : purchases) {
			//
			// need to fix this to display customer name and book title!!!!!!! Format price to add money sign?
			//
			text = String.format(PURCHASE_FORMAT, purchase.getCustomerID(), purchase.getBookID(), purchase.getPrice());
		}
	}

	private static void println(String text, PrintStream out) {
		out.println(text);
		LOG.info(text);
	}

}
