/**
 * Project: examples8
 * File: BankFixed.java
 * Date: Oct 29, 2018
 * Time: 8:41:56 PM
 * Copyright 2018 Sam Cirka. All rights reserved.
 */

package bankdemo;

/**
 * @author Sam Cirka, A00123456
 *
 */
public class BankFixed extends Bank implements Transferable {

	public BankFixed() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * @see bankdemo.Transferable#transfer(int, int, double)
	 */
	@Override
	public synchronized void transfer(int from, int to, double amount) {
		System.out.println(String.format("From %d, To %d, Amount = %5.0f", from, to, amount));
		while (accounts[from] < amount) {
			try {
				System.out.println(String.format("%d only has %d but needs %5.0f. Waiting for more cash", from, accounts[from], amount));
				wait();
				System.out.println(String.format("%d is looking for cash", from));
				Thread.sleep(100);
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

		getAccountsBalance();

		notifyAll();
	}

}
