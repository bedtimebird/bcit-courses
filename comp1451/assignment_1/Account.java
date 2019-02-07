
import java.util.ArrayList;

/**
 * @author A00964363
 */
public class Account {
 private Customer customer;
 private String accountNumber;
 private Date dateCreated;
 private double balance;
 private ArrayList<TransactionRecord> transactions;
 //counter for the creation of all account numbers
 private static int count = 1000;

/**
 * @constructor
 */
 public Account(Customer customer, Date dateCreated, double balance) {
   setCustomer(customer);
   setDateCreated(dateCreated);
   setBalance(balance);
   createAccountNumber();
   transactions = new ArrayList<TransactionRecord>();
 }
/**
 * @param set customer object
 */
 public void setCustomer(Customer customer) {
   this.customer = customer;
 }
 /**
 * @return customer object
 */
 public Customer getCustomer() {
   return customer;
 }
 /**
 * @param set date object
 * call from Checks to see if datecreated is null, if null IllegalArgumentException
 */
 public void setDateCreated(Date dateCreated) {
   this.dateCreated = Checks.dateNotNull(dateCreated);
 }
/**
 * @return dateCreated object
 */
 public Date getDateCreated() {
   return dateCreated;
 }
/**
 * @param set balance double
 * call doubleValue() from Checks to ensure double value greater than minimum
 */
 public void setBalance(double balance){
   this.balance = Checks.doubleValue(balance);
 }
 /**
 * @return balance (double)
 */
 public double getBalance() {
   return balance;
 }
/**
 * @param accountNumer (String)
 * call accountLength() from Checks to ensure accountNumber provided is valid length
 */
 public void setAccountNumber(String accountNumber) {
   this.accountNumber = Checks.accountLength(accountNumber);
 }
  /**
 * @return accountNumber (String)
 */
 public String getAccountNumber() {
   return accountNumber;
 }
 /**
 * method to generate new accountNumber for each account
 * @param count (int) is seed value to be incremented off
 * call setAccountNumber() to apply generated account
 */
 private void createAccountNumber() {
	 accountNumber = "" + count;
	 count++;
	 setAccountNumber(accountNumber);
 }
/**
 * method to deposit 
 * @param amount is value - check that value is positive
 * @return boolean value if desposit was sucessful
 */
 public boolean deposit(double amount){
   boolean depositAllowed = false;
   if (amount > 0) {
     setBalance(getBalance() + amount);
     depositAllowed = true;
   } else {
     System.out.println("Deposit amount must be greater than zero.");
     depositAllowed = false;
   }
 return depositAllowed;
 }
 /**
 * method to withdraw 
 * @param amount is value - check that value is positive
 * @return boolean value if desposit was sucessful
 */
 public boolean withdraw(double amount){
   boolean withdrawAllowed = false;
   if (amount > 0 && amount <= getBalance()) {
     setBalance(getBalance() + amount);
     withdrawAllowed = true;
   } else {
     System.out.println("Withdraw amount must be greater than zero and less than or equal to account balance");
     withdrawAllowed = false;
   }
 return withdrawAllowed;
 }
/**
 * method to record a transaction
 * @param transaction obeject added to transactions
 */
 public void recordTransaction(TransactionRecord transaction) {
   transactions.add(transaction);
 }
 /**
 * method display all transactions 
 * @return transaction obeject added to transactions
 */
 public void showTransactions() {
   System.out.println("List of account details including all: " + getAccountNumber());
   for (TransactionRecord transactions : transactions) {
     System.out.println(transactions.reviewTransaction());
   }
 }
 /**
 * method display account information 
 * @return customer Name
 * @return account Number
 * @return account balance (formatted to two decimal places)
 * @return date account was created
 */
 public void displayAccountInfo() {
   System.out.println("Account information:");
   System.out.println("Customer: " + customer.getName());
   System.out.println("Account: " + getAccountNumber());
   System.out.println("Balance: $" + Checks.formatMoney(getBalance()));
   System.out.println("Date created: " + getDateCreated().stringMonth());
 }

}
