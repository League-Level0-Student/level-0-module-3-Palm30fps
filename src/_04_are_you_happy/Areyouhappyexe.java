package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Areyouhappyexe {
	public static void main(String[] args) {

		String step1 = JOptionPane.showInputDialog("Do you have a problem?");

		if (step1.equals("no")) {
			JOptionPane.showMessageDialog(null, "Then you're fine!");
		}

		if (step1.equals("yes")) {
			String step2 = JOptionPane.showInputDialog("Can you do anything about it?");

			if (step2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Then relax");
			}
		if(step2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then resolve the problem!");
		}
		}

	}

}
