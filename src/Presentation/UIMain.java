package Presentation;

import javax.swing.JFrame;

public class UIMain extends JFrame {	

	private static final long serialVersionUID = 1L;

	// Main
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		new Presentation(f);
		
		f.setTitle("CarboneIUT");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 200);
		f.setLocationRelativeTo(null);  // Start the window in the middle of the screen
		f.setResizable(false);
		f.setVisible(true);
	}
}