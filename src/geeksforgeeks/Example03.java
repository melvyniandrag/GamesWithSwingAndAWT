package geeksforgeeks;

//Java Program to Create a JPanel with a Box layout
//and Adding components to it

//Importing required classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Main class
//Extending JFrame class
// Note to students:
// try resizing the window. 
// The buttons stay put.
// but on my monitor, on windows10, I cannot shrink the window to squish or 
// obscure the buttons.
// Is that a guarantee from Java? 
// Is there something in swing/awt that prevents us from shrinking the window down to a point?
// does the OS take care of this?
// Interesting questions! 
// GUI development is hard and takes alot of thought!
// ANOTHER NOTE:
// In here we set the box layout to YAxis. Can we set it to XAxis?
// Is there a diagonal layout?
// Another question:
// We've seen BoxLayout and BorderLayout.
// Are there others?
// Another question:
// so far our buttons do nothing.
// Can we make them do anything?
class Example03 extends JFrame {

	// JFrame
	static JFrame f;

	// JButton
	static JButton b, b1, b2, b3;

	// Label to display text
	static JLabel l;

	// Main drive method
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

		// Creating a panel to add buttons and
		// textfield and a layout
		JPanel p = new JPanel();

		// Setting box layout
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		// Adding buttons and textfield to panel
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(l);

		// Setting background of panel
		p.setBackground(Color.red);

		// Adding panel to frame
		f.add(p);

		// Setting the size of frame
		f.setSize(300, 300);

		f.setVisible(true);
	}
}
