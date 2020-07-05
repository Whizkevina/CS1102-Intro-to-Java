/**
 * 
 */

/**
 * @author ICTG_HP
 *
 */

import javax.swing.JOptionPane;

public class Quiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String question = "What is the name of US Current President? \n";
		
		question += "A. George Bush \n";
		question += "B. Barrack Obama \n";
		question += "C. Kennedy J. F. \n";
		question += "D. Hillary Clinton \n";
		question += "E. Donald Trump \n";
		
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			
			answer = answer.toUpperCase();
			
			if (answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				break;
			} else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")) {
				JOptionPane.showMessageDialog(null, "Incorrect. Please try again");
			} else {
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E.");
			}
			}
		}
		
		
		
			}
