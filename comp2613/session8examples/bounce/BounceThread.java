package bounce;
// BounceThread.java

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BounceThread extends JFrame {
	private static int index;

	private Button btnStart = new Button("Start");
	private Button btnClose = new Button("Close");
	private Canvas canvas;
	private static int threadNumber;

	public BounceThread() {
		super("BounceThread");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		canvas = new Canvas();
		add(canvas, BorderLayout.CENTER);

		Panel panel = new Panel();
		panel.add(btnStart);
		panel.add(btnClose);
		add(panel, BorderLayout.SOUTH);

		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index > NamedColor.Yellow.ordinal()) {
					index = 0;
				}
				Ball ball = new Ball(canvas, NamedColor.getNamedColor(index));
				threadNumber++;
				BouncerThread bouncerThread = new BouncerThread(ball, threadNumber);
				bouncerThread.start();
				index++;
			}
		});

		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		BounceThread bounceThread = new BounceThread();
		bounceThread.setSize(300, 200);
		bounceThread.setVisible(true);
	}

}
