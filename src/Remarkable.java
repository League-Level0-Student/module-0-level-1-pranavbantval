import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hello there. What is your name?");
		if (name.equalsIgnoreCase("ryan")) {
			JOptionPane.showMessageDialog(null, "I like your shoes.");
		} else if (name.equalsIgnoreCase("phillip")) {
			JOptionPane.showMessageDialog(null, "You are pretty cool.");
		} else if (name.equalsIgnoreCase("kyle")) {
			JOptionPane.showMessageDialog(null, "Have a nice evening.");
		} else if (name.equalsIgnoreCase("Max")) {
			JOptionPane.showMessageDialog(null, "Have a great day.");
		}

		else if (name.equalsIgnoreCase("pranav")) {
			JOptionPane.showMessageDialog(null, "Hello owner. You made me work. Thank you.");
		} else {
			JOptionPane.showMessageDialog(null, "Oh NO! I haven't been expecting you!");
		}
	}
}
