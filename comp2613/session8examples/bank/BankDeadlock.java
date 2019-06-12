/**
 * Project: examples8
 * File: BankDeadlock.java
 * Date: Mar 3, 2015
 * Time: 5:06:32 PM
 */

package bankdemo;

/**
 * @author Sam Cirka, A00123456
 *
 */

public class BankDeadlock extends Bank implements Transferable {

	public BankDeadlock() {
		super();
	}

	@Override
	public synchronized void transfer(int from, int to, double amount) {
		System.out.println(String.format("Transfer from %d, To %d, Amount = %5.0f", from, to, amount));
		while (accounts[from] < amount) {
			System.out.println(String.format("%d only has %d but needs %5.0f. Waiting for more cash", from, accounts[from], amount));
			try {
				wait(60 * 1000);
			} catch (InterruptedException e) {
			}
		}

		accounts[from] -= amount;
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
		if (transactionCount % 500 == 0) {
			getAccountsBalance();
		}
	}

}
