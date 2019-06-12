package bankdemo;

class BankDemo {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		for (int accountNumber = 1; accountNumber <= Bank.ACCOUNTS; accountNumber++) {
			new TransferMoney(bank, accountNumber).start();
		}
	}
}
