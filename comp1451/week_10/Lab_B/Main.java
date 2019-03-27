/**
* @author A00964363
*/

public class Main {
	public static void main(String[] args) {
    BankAccount acct = new BankAccount("Bill", 150.00);
    Bank bank = new Bank(acct);
    bank.processTransaction();
	}
}
