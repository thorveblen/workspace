import javax.swing.JOptionPane;

public class RandonGuess {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"The number is "+

		(1 + (int)(Math.random() * 10)));
	}

}

