package geeksforgeeks;

//Java Program to create a simple JTextArea
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Example05 extends JFrame implements ActionListener {

	// JFrame
	static JFrame f;

	// JButton
	static JButton b;

	// label to display text
	static JLabel l;

	// text area
	static JTextArea jt;

	// default constructor
	Example05()
	{
	}

	// main class
	public static void main(String[] args)
	{
		// create a new frame to store text field and button
		f = new JFrame("textfield");

		// create a label to display text
		l = new JLabel("nothing entered");

		// create a new button
		b = new JButton("submit");

		// create a object of the text class
		Example05 te = new Example05();

		// addActionListener to button
		b.addActionListener(te);

		// create a text area, specifying the rows and columns
		jt = new JTextArea(10, 10);

		JPanel p = new JPanel();

		// add the text area and button to panel
		p.add(jt);
		p.add(b);
		p.add(l);

		f.add(p);
		// set the size of frame
		f.setSize(300, 300);

		f.show();
	}

	// if the button is pressed
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if (s.equals("submit")) {
			// set the text of the label to the text of the field
			l.setText(jt.getText());
		}
	}
}
