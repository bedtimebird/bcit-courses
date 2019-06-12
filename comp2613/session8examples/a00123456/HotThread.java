/**
 * Project: A00123456Lab9
 * File: Test2.java
 */

package a00123456;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Sam Cirka, A00123456
 *
 */
public class HotThread extends Thread {

	private static final Logger LOG = LogManager.getLogger();
	private int max;

	public HotThread(int count, int max) {
		super(String.valueOf(count));

		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 0; i < max; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}

		LOG.trace(String.format("Thread %s has executed %d iterations", getName(), max));
	}

}
