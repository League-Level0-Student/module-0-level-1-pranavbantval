import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("When is your birthday? (month/day)");
	if (name.equalsIgnoreCase("10/13")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
	}
	
	
}
}
