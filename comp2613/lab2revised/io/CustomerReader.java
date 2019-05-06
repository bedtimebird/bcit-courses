/**
 * Project: a00964363
 * File: CustomerReader.java
 * Date: Apr 27, 2019
 * Time: 10:42:59 AM
 */
package lab2revised.io;

import lab2revised.data.Customer;

/**
 * @author Mike Bird, A00964363
 *
 */
public class CustomerReader {

	public static final String RECORD_DELIMITER = ":";
	public static final String FIELD_DELIMITER = "\\|";

	/**
	 * private constructor to prevent instantiation
	 */
	private CustomerReader() {

	}

	/**
	 * Write the report.
	 * 
	 * @param customers
	 *            the customers
	 */
	public static Customer[] read(String data) {
		String[] rows = data.split(RECORD_DELIMITER);
		Customer[] customers = new Customer[rows.length];
		for (int i = 0; i < rows.length; i++) {
			String[] splitTwo = rows[i].split(FIELD_DELIMITER);
			customers[i] = new Customer.Builder(Integer.parseInt(splitTwo[0]), splitTwo[6]).firstName(splitTwo[1]).lastName(splitTwo[2])
					.streetName(splitTwo[3]).city(splitTwo[4]).postalCode(splitTwo[5]).emailAddress(splitTwo[7]).build();
		}
		return customers;
	}

}
