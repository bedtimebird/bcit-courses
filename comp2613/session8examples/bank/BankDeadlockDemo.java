package bankdemo;

class BankDeadlockDemo {

	public static void main(String[] args) {
		BankDeadlock bank = new BankDeadlock();

		for (int accountNumber = 1; accountNumber <= BankDeadlock.ACCOUNTS; accountNumber++) {
			new TransferMoney(bank, accountNumber).start();
		}
	}
}
