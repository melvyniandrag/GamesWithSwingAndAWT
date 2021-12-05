package usingwhatilearned;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangingButton extends JFrame implements ActionListener{

	static JFrame f;
	
	static JButton b;
	
	static int buttonId = 0;
	
	ChangingButton(){
		
	}
	
	public static void main(String[] args) {
		f = new JFrame("Button Test");
		b = new JButton("-");
		ChangingButton cb = new ChangingButton();
		b.addActionListener(cb);
		b.putClientProperty("id", Integer.valueOf(buttonId)); // add a property called "id" to the button so we can uniquely identify it
		buttonId+=1;
		f.add(b);
		f.setSize(300,300);
		f.setResizable(false);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object caller = e.getSource();
		if(caller instanceof JButton) {
			Object property = ((JButton)caller).getClientProperty("id"); // which button was clicked? Get the button's id so you know.
			if(property instanceof Integer) {
				Integer buttonId = ((Integer)property); // case the button id to Integer from Object.
				if(buttonId == 0) { // Now add handlers for buttons 1, 2, 3, ...., 8
					b.setText("x"); // or set to "o" as appropriate
				}
				else if (buttonId == 1) {
					// set the text.
				}
				else if (buttonId == 2) {
					//set the text
				}
				/*
				 * etc add handlers for the other buttons on the tic tac toe board.
				 */
			}

		}

	}
	
}
