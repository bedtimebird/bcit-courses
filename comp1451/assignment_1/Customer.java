/**
 * @author A00964363
 */
public class Customer {
	 private String name;
	 private String address;
	 private Date dateOfBirth;
  /**
  * @constructor
  */
	  public Customer(String name, String address, Date dateOfBirth){
	   setName(name);
	   setAddress(address);
	   setDateOfBirth(dateOfBirth);
	 }
  /**
  * apply Checks stringLengh() and formatName()
  * @param name String
  */
	 public void setName(String name) {
	   this.name = Checks.formatName(Checks.stringLength(name));
	 }
  /**
  * @return name String
  */
	 public String getName() {
	   return name;
	 }
  /**
  * apply Checks stringLengh() and formatName()
  * @param address String
  */
	 public void setAddress(String address){
	   this.address = Checks.formatName(Checks.stringLength(address));
	 }
   /**
  * @return address String
  */
	 public String getAddress() {
	   return address;
	 }
  /**
  * apply dateNotNull() check
  * @param dateOfBirth Date
  */
	 public void setDateOfBirth(Date dateOfBirth){
	   this.dateOfBirth = Checks.dateNotNull(dateOfBirth);
	 }
   /**
  * @return dateOfBirth String
  */
	 public Date getDateOfBirth() {
	   return dateOfBirth;
	 }
  /**
  * method to display customer information
  * @return name, address, dateOfBirth
  */
	 public void displayCustomer() {
	   System.out.println("Customer name: " + getName());
	   System.out.println("Customer address: " + getAddress());
	   System.out.println("Customer date of birth: " + getDateOfBirth().stringMonth());
	 }
	}
