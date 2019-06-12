/**
 * Project: examples8
 * File: Bank.java
 * Date: Mar 1, 2015
 * Time: 8:13:16 PM
 */

package bankdemo;

/**
 * @author Sam Cirka, A00123456
 *
 */
public class Bank implements Transferable {
	public static final int INITIAL_BALANCE = 10000;
	public static final int ACCOUNTS = 10;

	int[] accounts;
	int transactionCount;

	public Bank() {
		accounts = new int[ACCOUNTS];
		for (int i = 0; i < ACCOUNTS; i++) {
			accounts[i] = INITIAL_BALANCE;
		}

		transactionCount = 0;
		getAccountsBalance();
	}

	@Override
	public void transfer(int from, int to, double amount) {
		accounts[from] -= amount;

		// System.out.println(String.format("%d has %d and is transfering %5.0f.", from, accounts[from], amount));
		// simulates transaction delay ...
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}

		accounts[to] += amount;
		// simulates transaction delay ...
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}

		transactionCount++;
		if (transactionCount % 500 == 0)
			getAccountsBalance();
	}

	public void getAccountsBalance() {
		int sum = 0;
		for (int i = 0; i < ACCOUNTS; i++) {
			sum += accounts[i];
		}

		System.out.println("Transactions:" + transactionCount + " Sum: " + sum);
	}
}
