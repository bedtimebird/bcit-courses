package bounce;
//BounceThread.java

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BounceRunnable extends JFrame {
	private static int index;

	private Button btnStart = new Button("Start");
	private Button btnClose = new Button("Close");
	private Canvas canvas;
	private int threadNumber;

	public BounceRunnable() {
		super("BounceRunnable");

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
				Thread bouncerThread = new Thread(new BouncerRunnable(ball));
				bouncerThread.setName(ball.getNamedColor().getName() + "-" + ++threadNumber);
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
		BounceRunnable bounceThread = new BounceRunnable();
		bounceThread.setSize(300, 200);
		bounceThread.setVisible(true);
	}
}
