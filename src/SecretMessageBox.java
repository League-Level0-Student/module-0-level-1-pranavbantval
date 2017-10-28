//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		
	
	// 1. Set the passcode in a String variable
	String password = "Biggie cheese";
	// 2. Using a pop-up, ask for a secret message and store it in a variable
String sm = JOptionPane.showInputDialog("What is the secret message?");
	// 3. Ask your friend for the passcode and store it in a variable
String passcode = JOptionPane.showInputDialog("What is the passcode?");
	// 4. If the passcode matches, show the secret message
if (passcode == password) {
	JOptionPane.showMessageDialog(null, sm);
}
else if (passcode.equalsIgnoreCase("Biggie cheese")) {
	JOptionPane.showMessageDialog(null, sm);
}
	// 5. If the passcode does not match, pop-up "INTRUDER!!"

else {
	JOptionPane.showMessageDialog(null, "INTRUDER!");
}
	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.
	}
}
