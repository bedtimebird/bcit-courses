/**
 * Project: a00964363
 * File: Customer.java
 * Date: Apr 27, 2019
 * Time: 10:42:32 AM
 */
package lab2.data;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Customer {

	private final int customerID;
	private final String firstName;
	private final String lastName;
	private final String streetName;
	private final String city;
	private final String postalCode;
	private final String phoneNumber;
	private final String emailAddress;
	private final String joinDate;

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @return the joinDate
	 */
	public String getJoinDate() {
		return joinDate;
	}

	public static class Builder {
		// required params
		private final int customerID;
		private final String phoneNumber;
		// optional params
		private String firstName;
		private String lastName;
		private String streetName;
		private String city;
		private String postalCode;
		private String emailAddress;
		private String joinDate;

		public Builder(int customerID, String phoneNumber) {
			this.customerID = customerID;
			this.phoneNumber = phoneNumber;
		}

		public Builder firstName(String val) {
			firstName = val;
			return this;
		}

		public Builder lastName(String val) {
			lastName = val;
			return this;
		}

		public Builder streetName(String val) {
			streetName = val;
			return this;
		}

		public Builder city(String val) {
			city = val;
			return this;
		}

		public Builder postalCode(String val) {
			postalCode = val;
			return this;
		}

		public Builder emailAddress(String val) {
			emailAddress = val;
			return this;
		}

		public Builder joinDate(String val) {
			joinDate = val;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}
	}

	private Customer(Builder builder) {
		customerID = builder.customerID;
		phoneNumber = builder.phoneNumber;
		firstName = builder.firstName;
		lastName = builder.lastName;
		streetName = builder.streetName;
		city = builder.city;
		postalCode = builder.postalCode;
		emailAddress = builder.emailAddress;
		joinDate = builder.joinDate;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", streetName=" + streetName + ", city="
				+ city + ", postalCode=" + postalCode + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", joinDate=" + joinDate
				+ "]";
	}

}
