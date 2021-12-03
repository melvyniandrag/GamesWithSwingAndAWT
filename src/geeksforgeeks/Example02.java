package geeksforgeeks;


// Java Program to Create a JPanel with a Border Layout
// and Adding Components to It

// Importing required classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Main class
// Extending JFrame class
// Note to students:
// Just like before try resizing the window. 
// You will notice that the requested size 300,300 is not locked. 
// If you resize the window, everything scales. Nice!
// Question: Is it possible to lock the size?
// Question2: If you can lock the frame size so it can't be rescaled - what
// happens if the requested size is bigger than your monitor?
// Does Java handle that, or does the operating system?
public class Example02 {
	// JFrame
	static JFrame f;

	// JButton
	static JButton b, b1, b2, b3;

	// Label to display text
	static JLabel l;

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a new frame to store text field and
		// button
		f = new JFrame("panel");

		// Creating a label to display text
		l = new JLabel("panel label");

		// Creating a new buttons
		b = new JButton("button1");
		b1 = new JButton("button2");
		b2 = new JButton("button3");
		b3 = new JButton("button4");

		// Creating a panel to add buttons
		// and a specific layout
		JPanel p = new JPanel(new BorderLayout());

		// Adding buttons and textfield to panel
		// using add() method
		p.add(b, BorderLayout.NORTH);
		p.add(b1, BorderLayout.SOUTH);
		p.add(b2, BorderLayout.EAST);
		p.add(b3, BorderLayout.WEST);
		p.add(l, BorderLayout.CENTER);

		// setbackground of panel
		p.setBackground(Color.red);

		// Adding panel to frame
		f.add(p);

		// Setting the size of frame
		f.setSize(300, 300);

		f.setVisible(true);
	}
}
