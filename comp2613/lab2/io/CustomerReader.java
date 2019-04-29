/**
 * Project: a00964363
 * File: CustomerReader.java
 * Date: Apr 27, 2019
 * Time: 10:42:59 AM
 */
package lab2.io;

import lab2.data.Customer;

/**
 * @author Mike Bird, A00964363
 *
 */
public class CustomerReader {

	private String input;
	private String[] splitOne;
	private String[] splitTwo;
	private Customer[] customerList;

	/**
	 * @param input
	 */
	public CustomerReader(String input) {
		setInput(input);
		customerList = new Customer[countCustomerRecords()];
	}

	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * @param input
	 *            the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}

	public int countCustomerRecords() {
		breakSplitOne();
		return splitOne.length;
	}

	public void breakSplitOne() {
		input = getInput();
		String delimiter = ":";
		splitOne = input.split(delimiter);
	}

	public void breakSplitTwo() {
		for (int i = 0; i < splitOne.length; i++) {
			input = splitOne[i];
			String delimiter = "\\|";
			splitTwo = input.split(delimiter);
			customerList[i] = new Customer.Builder(Integer.parseInt(splitTwo[0]), splitTwo[7]).build();
		}
	}

	public void displaySplitOne() {
		for (int i = 0; i < splitOne.length; i++) {
			System.out.println(splitOne[i]);
		}
	}

	public void diplaySplitTwo() {
		for (int i = 0; i < splitTwo.length; i++) {
			System.out.println(splitTwo[i]);
		}
	}

	public void displayCustomerArray() {
		for (int i = 0; i < customerList.length; i++) {
			System.out.println(customerList[i].getCustomerID() + " " + customerList[i].getFirstName());
		}
	}

}
