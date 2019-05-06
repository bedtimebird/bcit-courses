/**
 * Project: a00964363
 * File: CustomerReport.java
 * Date: Apr 27, 2019
 * Time: 10:43:10 AM
 */
package lab2revised.io;

import lab2revised.data.Customer;

/**
 * @author Mike Bird, A00964363
 *
 */
public class CustomerReport {

	/**
	 * private constructor to prevent instantiation
	 */
	private CustomerReport() {

	}

	/**
	 * Write the report.
	 * 
	 * @param customers
	 *            the customers
	 */
	public static void write(Customer[] customers) {

		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format(" %2s %-6s %-10s %-12s %-25s %-10s %-10s %-15s %-15s\n", "#.", "ID", "First Name", "Last Name", "Street", "City",
				"Postal Code", "Phone", "Email");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------");

		int counter = 1;
		for (Customer i : customers) {
			System.out.format("%3s %06d %-10s %-12s %-25s %-10s %-10s %-15s %-15s\n", counter++ + ".", i.getCustomerID(), i.getFirstName(),
					i.getLastName(), i.getStreetName(), i.getCity(), i.getPostalCode(), i.getPhoneNumber(), i.getEmailAddress());
		}
	}

}
