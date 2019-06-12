package bankdemo;

public class BankFixedDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankFixed bank = new BankFixed();
		for (int accountNumber = 1; accountNumber <= BankFixed.ACCOUNTS; accountNumber++) {
			new TransferMoney(bank, accountNumber).start();
		}
	}

}
