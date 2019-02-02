package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your test score?");
		int hi = Integer.parseInt(score);
		if (hi > 100) {
			JOptionPane.showMessageDialog(null, "That is exceptional.");
		} else if (hi >= 90) {
			JOptionPane.showMessageDialog(null, "That is great.");
		} else if ((hi < 90) && (hi >= 80)) {
			JOptionPane.showMessageDialog(null, "That is good.");
		} else if ((hi < 80) && (hi >= 70)) {
			JOptionPane.showMessageDialog(null, "That is okay.");
		} else if ((hi < 70) && (hi >= 60)) {
			JOptionPane.showMessageDialog(null, "That is bad.");
		} else if ((hi < 60) && (hi >= 50)) {
			JOptionPane.showMessageDialog(null, "That is really bad.");
		} else if ((hi < 50) && (hi >= 40)) {
			JOptionPane.showMessageDialog(null, "That is really, really bad.");
		} else if ((hi < 40) && (hi >= 30)) {
			JOptionPane.showMessageDialog(null, "That is really, really, really bad.");
		} else if ((hi < 30) && (hi >= 20)) {
			JOptionPane.showMessageDialog(null, "That is horrible.");
		} else if ((hi < 20) && (hi >= 10)) {
			JOptionPane.showMessageDialog(null, "That is really horrible.");
		} else {
			JOptionPane.showMessageDialog(null, "That is really, really horrible.");
		}
	}
}
