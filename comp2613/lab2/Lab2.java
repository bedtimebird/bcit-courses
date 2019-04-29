/**
 * Project: a00964363
 * File: Lab2.java
 * Date: Apr 27, 2019
 * Time: 10:42:09 AM
 */
package lab2;

import lab2.io.CustomerReader;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(args[0]);
		CustomerReader listCustomers = new CustomerReader(args[0]);
		listCustomers.breakSplitTwo();
		listCustomers.displayCustomerArray();	
	}

}
