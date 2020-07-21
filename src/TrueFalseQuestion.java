import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	
	TrueFalseQuestion(String question, String answer){
		this.question = "TRUE or FALSE: "+question;
		this.correctAnswer = "TRUE or FALSE "+answer; 
	}

	@Override
	String ask() {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			boolean valid = (answer.equals("f") || answer.equals("false") || answer.equals("False") || answer.equals("FALSE") || answer.equals("n") || answer.equals("no") || answer.equals("No") || answer.equals("NO") || answer.equals("t") || answer.equals("true") || answer.equals("T") || answer.equals("True") || answer.equals("TRUE") || answer.equals("y") || answer.equals("yes") || answer.equals("Y") || answer.equals("Yes") || answer.equals("YES"));
			
			if (valid) return answer;
			
			JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
		}
		
	}

}
