package bounce;
// Bounce.java

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Bounce extends JFrame {
	private static int index;

	private Button btnStart = new Button("Start");
	private Button btnClose = new Button("Close");
	private Canvas canvas;

	public Bounce() {
		super("Bounce");

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
				ball.bounce();
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
		Bounce bounce = new Bounce();
		bounce.setSize(300, 200);
		bounce.setVisible(true);
	}
}
