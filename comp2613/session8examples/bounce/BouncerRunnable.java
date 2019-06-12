/**
 * Project: examples8
 * File: BouncerRunnable.java
 * Date: Mar 2, 2015
 * Time: 7:00:40 PM
 */

package bounce;

/**
 * @author Sam Cirka, A00123456
 *
 */
public class BouncerRunnable implements Runnable {

	private Ball ball;

	public BouncerRunnable(Ball ball) {
		this.ball = ball;
	}

	public void run() {
		ball.bounce();
	}

}
