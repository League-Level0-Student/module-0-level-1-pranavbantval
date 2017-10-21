import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What comes down but never goes up?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equalsIgnoreCase("rain")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer was rain.");
		}
		// 6. Add some more riddles
		answer = JOptionPane.showInputDialog("I’m tall when I’m young and I’m short when I’m old. What am I?");
		if (answer.equalsIgnoreCase("candle")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else if (answer.equalsIgnoreCase("a candle")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer was a candle.");
		}
		answer = JOptionPane
				.showInputDialog("10 fish are in a tank. 2 drown, 3 die, and 1 swims away. How many fish are left?");
		if (answer.equalsIgnoreCase("10")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;

		} else {
			JOptionPane.showMessageDialog(null,
					"Wrong. The answer was 10. Fish can't drown, if they die they are still in the tank, and they can't swim away in a tank.");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score + "!");
	}
}
