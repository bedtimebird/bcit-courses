import javax.swing.*;

@SuppressWarnings("serial")
public class FlashingText extends JFrame implements Runnable {
	private JLabel textLabel = new JLabel("Welcome", JLabel.CENTER);

	public FlashingText() {
		super("FlashingText");
		
		add(textLabel);
		new Thread(this).start();
	}

	/** Repaint the clock every 200 milliseconds */
	public void run() {
		try {
			while (true) {
				if (textLabel.getText() == null) {
					textLabel.setText("Welcome");
				} else {
					textLabel.setText(null);
				}

				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	/** Main method */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new FlashingText();
				frame.setLocationRelativeTo(null); // Center the frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(200, 200);
				frame.setVisible(true);
			}
		});
	}
}
