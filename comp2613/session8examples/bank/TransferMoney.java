/**
 * Project: examples8
 * File: TransactionThread1.java
 * Date: Mar 1, 2015
 * Time: 8:14:14 PM
 */

package bankdemo;

/**
 * @author Sam Cirka, A00123456
 *
 */
public class TransferMoney extends Thread {
	private Transferable bank;
	private int from;

	public TransferMoney(Transferable bank, int i) {
		from = i - 1;
		this.bank = bank;
	}

	public void run() {
		while (true) {
			int to = (int) ((Bank.ACCOUNTS - 1) * Math.random());
			if (to == from) {
				to = (to + 1) % Bank.ACCOUNTS;
			}
			
			int amount = (int) (Bank.INITIAL_BALANCE * Math.random());
			bank.transfer(from, to, amount);
			
			try {
				sleep(1);
			} catch (InterruptedException e) {
			}
		}
	}
}
