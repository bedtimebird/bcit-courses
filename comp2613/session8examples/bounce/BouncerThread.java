/**
 * Project: examples8
 * File: BouncerThread.java
 * Date: Mar 2, 2015
 * Time: 7:01:59 PM
 */

package bounce;

/**
 * @author Sam Cirka, A00123456
 *
 */
public class BouncerThread extends Thread {

	private Ball ball;

	public BouncerThread(Ball ball, int threadNumber) {
		this.ball = ball;
		setName(ball.getNamedColor().getName() + "-" + threadNumber);
	}

	public void run() {
		ball.bounce();
	}

}
