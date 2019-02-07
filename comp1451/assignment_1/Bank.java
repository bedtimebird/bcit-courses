import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
/**
 * @author A00964363
 */
public class Bank {

  private String bankName;
  private HashMap<String, Account> bankAccounts;
/**
 * create Bank object
 * @param bankName to set name
 */
  public Bank(String bankName) {
    setBankName(bankName);
    createBankAccount();
  }
  /**
 * @param set bankName
 * check String length
 */
  public void setBankName(String bankName){
    this.bankName = Checks.stringLength(bankName);
  }
   /**
 * @return bankName string
 */
  public String getBankName() {
    return bankName;
  }
/**
 * method create hashMap of accountNumber(String) and Accounts
 */
  public void createBankAccount() {
    bankAccounts = new HashMap<String, Account>();
  }
 /**
 * method to addAccount to hashMap. 
 * checks if account number exists in hashmap. if no then adds Account
 * @param toAdd is Account object
 */
  public void addAccount(Account toAdd) {
    if(toAdd != null) {
      bankAccounts.put(toAdd.getAccountNumber(), toAdd);
    } else {
      System.out.println("Must provide valid account.");
    }
  }
   /**
 * method to search hashMap for accountNumber
 * @param accountNumber String
 * @return acct Account
 */
  public Account getAccount(String accountNumber){
    Account acct = bankAccounts.get(Checks.accountLength(accountNumber));
      if (acct == null) {
        System.out.println("Account number " + accountNumber + " not found.");
      } else {
        acct.displayAccountInfo();  
      }
  return acct;
  }

/**
 * method to display all transactions base on customer name input
 * @param customerName String
 * @return list of account information and all transactions
 */
  public void showTransactions(String customerName){
    boolean found = false;
    Set<Map.Entry<String, Account>>findName = bankAccounts.entrySet();
    for(Map.Entry<String, Account> s:findName){
      if (s.getValue().getCustomer().getName().equals(Checks.formatName(customerName))){
        s.getValue().displayAccountInfo();
        System.out.println(" ");
        s.getValue().showTransactions();
        System.out.println(" ");
        found = true;
      }       
    }
    if (found == false) {
      System.out.println("No records found for " + customerName + ".");
      }
  }
/**
 * method to display all account numbers
 */
  public void displayAccountNumbers() {
    for (Account acctName : bankAccounts.values()){
      System.out.println(acctName.getAccountNumber());
    }
  }
/**
 * method process a transaction and navigate through. 
 * list of bank account provided to start
 * calls choiceToEnd() at various points to exit loop
 */
  public void makeTransaction() {
    boolean end = true;
    while (end) {
        System.out.println("Please enter account number:");
        String acctString = Checks.scanInputString();
        if(bankAccounts.containsKey(acctString)) {
          System.out.println("What action would you like to do?");
          System.out.println("1. Deposit");
          System.out.println("2. Withdraw");
          System.out.println("3. Show Transactions");
          System.out.println("(Enter 1, 2 or 3)");
          switch(Checks.scanInputInt()) {
            case 1: System.out.println("How much would you like to deposit?");
                    double inputDeposit = Checks.scanInputDouble();
                    if(bankAccounts.get(acctString).deposit(inputDeposit) == true) {
                      makeTransRecord(acctString, inputDeposit, "Deposit");
                      break;
                    } else {
                      end = false;
                      break;
                    }
            case 2: System.out.println("How much would you like to withdraw?");
                    double inputWithdraw = Checks.scanInputDouble();
                    if(bankAccounts.get(acctString).withdraw(inputWithdraw) == true) {
                      makeTransRecord(acctString, inputWithdraw, "Withdraw");
                      break;
                    } else {
                      end = false;
                      break;
                    }
            case 3: System.out.println("Please provide user name.");
                    showTransactions(Checks.scanInputString());
                    end = choiceToEnd();
                    break;
            default:System.out.println("Please provide a valid selection.");
                    end = choiceToEnd();
                    break;
          }
        } else {
          System.out.println(acctString + " not found.");
        }
    }
  }
/**
 * method to record a transaction within makeTransaction()
 * exit method with choiceToEnd()
 * @param acctString String - account number - 
 * value checked with Checks.scanInputString();
 * @param inputDouble double
 * value checked with Checks.scanInputDouble();
 * @param transType String - type of transaction
 */
  public void makeTransRecord(String acctString, double inputDouble, String transType){
    Date newDate = Date.requestDate();
    TransactionRecord transaction = new TransactionRecord(inputDouble, newDate, acctString, transType);
    bankAccounts.get(acctString).recordTransaction(transaction);
    choiceToEnd();
  }
/**
 * method to end loop 
 * called various times through makeTransaction() 
 * @return boolean true = end loop / false = continue
 */
  public boolean choiceToEnd() {
    System.out.println("Would you like to perform another action?");
    System.out.println("Yes = 1");
    System.out.println("No = 2");
    boolean end = false;
    switch(Checks.scanInputInt()) {
      case 1: end = true;
              break;
      case 2: System.out.println("Goodbye");
              end = false;
              break;
      default: choiceToEnd();
    }
    return end;
  }  

}
