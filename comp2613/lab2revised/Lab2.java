/**
 * Project: a00964363
 * File: Lab2.java
 * Date: Apr 27, 2019
 * Time: 10:42:09 AM
 */
package lab2revised;

import lab2revised.data.Customer;
import lab2revised.io.CustomerReader;
import lab2revised.io.CustomerReport;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Lab2 {

	private String customerData;
	private Customer[] customers;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Input String must be provided");
			System.exit(-1);
		}

		new Lab2(args[0]).run();
	}

	public Lab2(String customerData) {
		this.customerData = customerData;
	}

	private void run() {
		customers = CustomerReader.read(customerData);
		CustomerReport.write(customers);
	}

}
