/**
 * Project: Assignment1_start
 * File: Purchase.java
 * Date: May 27, 2019
 * Time: 6:23:17 PM
 */
package a00964363.data;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Purchase {

	public static final int ATTRIBUTE_COUNT = 4;

	private long id;
	private long customerID;
	private long bookID;
	private double price;

	public Purchase(long id, long customerID, long bookID, double price) {
		setId(id);
		setCustomerID(customerID);
		setBookID(bookID);
		setPrice(price);
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the customerID
	 */
	public long getCustomerID() {
		return customerID;
	}

	/**
	 * @return the bookID
	 */
	public long getBookID() {
		return bookID;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param customerID
	 *            the customerID to set
	 */
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}

	/**
	 * @param bookID
	 *            the bookID to set
	 */
	public void setBookID(long bookID) {
		this.bookID = bookID;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", customerID=" + customerID + ", bookID=" + bookID + ", price=" + price + "]";
	}

}
