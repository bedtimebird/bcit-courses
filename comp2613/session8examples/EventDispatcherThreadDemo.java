import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class EventDispatcherThreadDemo extends JFrame {
	public EventDispatcherThreadDemo() {
		super("EventDispatcherThreadDemo");

		add(new JLabel("Hi, Michael Son"));
	}

	/** Main method */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new EventDispatcherThreadDemo();
				frame.setLocationRelativeTo(null); // Center the frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(200, 200);
				frame.setVisible(true);
			}
		});
	}
}
