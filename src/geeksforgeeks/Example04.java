package geeksforgeeks;

//Java program to create a blank text
//field of definite number of columns.
import java.awt.event.*;
import javax.swing.*;

// NOTE To Students:
// Now we are dealing alot with text.
// How does Java handle weird text inputs?
// Can it handle emojis?
// Find a smile emoji on google and try and paste that unicode character in there
// A fun thing: Convert the input in the text field into bytes
// print out the bytes as a string instead of the text
// what encoding is used?

// Another activity for students:
// At a glance it looks to me that the button event has the same name as the button text.
// What happens if you have two buttons that both say submit?
// Does clicking either one trigger the event?
// This seems bad because what if you make an app with two submit buttons, but each one submits 
// something else?
// The button should be able to have a label and also be bound to a call back function.
// two buttons that show "submit" should be able to call different callbacks.

class Example04 extends JFrame implements ActionListener {

	// JTextField
	 static JTextField t;
	
	 // JFrame
	 static JFrame f;
	
	 // JButton
	 static JButton b;
	
	 // label to display text
	 static JLabel l;
	
	 // default constructor
	 Example04()
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
	     Example04 te = new Example04();
	
	     // addActionListener to button
	     b.addActionListener(te);
	
	     // create a object of JTextField with 16 columns
	     t = new JTextField(16);
	
	     // create a panel to add buttons and textfield
	     JPanel p = new JPanel();
	
	     // add buttons and textfield to panel
	     p.add(t);
	     p.add(b);
	     p.add(l);
	
	     // add panel to frame
	     f.add(p);
	
	     // set the size of frame
	     f.setSize(300, 300);
	
	     //f.show();
	     f.setVisible(true);
	 }
	
	 // if the button is pressed
	 public void actionPerformed(ActionEvent e)
	 {
	     String s = e.getActionCommand();
	     if (s.equals("submit")) { 
	         // set the text of the label to the text of the field
	         l.setText(t.getText());
	
	         // set the text of field to blank
	         t.setText("  ");
	     }
	 }
}