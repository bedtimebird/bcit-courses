/**
 * @author A00964363
 */
public class TransactionRecord {
	private double amount;
	private Date dateIssued;
	private String accountNumber;
	private String transactionType;
/**
 * @constructor
 */
	public TransactionRecord(double amount, Date dateIssued, String accountNumber, String transactionType) {
		setAmount(amount);
		setDateIssued(dateIssued);
		setAccountNumber(accountNumber);
		setTransactionType(transactionType);
	}
   /**
  * apply checkDateInput
  * @param year int
  */
	public void setAmount(double amount) {
		this.amount = Checks.doubleValue(amount);
	}
    /**
  * @return amount double
  */
	public double getAmount() {
		return amount;
	}
   /**
  * apply dateNotNull
  * @param dateIssued Date
  */
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = Checks.dateNotNull(dateIssued);
	}
    /**
  * @return dateIssued Date
  */
	public Date getDateIssued() {
		return dateIssued;
	}
   /**
  * apply accountLength
  * @param accountNumber String
  */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = Checks.accountLength(accountNumber);
	}
  /**
  * @return accountNumber String
  */
	public String getAccountNumber() {
		return accountNumber;
	}
  /**
  * apply transactionType
  * @param transactionType String
  */
	public void setTransactionType(String transactionType) {
		this.transactionType = Checks.transactionType(transactionType);
	}
    /**
  * @return transactionType String
  */
	public String getTransactionType() {
		return transactionType;
	}
 /**
  * method to print transaction and format date
  * @return transactionType String
  */
	public String reviewTransaction() {
		String transaction = ("Account Number: " + getAccountNumber() + ", Transaction Type: " + getTransactionType()
				+ ", Amount: $" + Checks.formatMoney(getAmount()) + ", Date: " + getDateIssued().stringMonth());
		return transaction;
	}
}
