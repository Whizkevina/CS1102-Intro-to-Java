/**
 * 
 */

/**
 * @author ICTG_HP
 *
 */

//import javax.swing.JOptionPane;

public class Quiz {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
		"Who is the President of USA?",
		"Barrack Obama",
		"George Bush",
		"Bill Clinton",
		"Donald Trump",
		"Abraham Lincoln",
		"D");
		question.check();
		
		
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
		"What is the name of Superman?",
		"Steve Clark",
		"Kent Clark",
		"Clark Kent",
		"Ark Ent",
		"Smallville",
		"C");
		question2.check();
		
		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
		"Is Java the same as Javascript?",
		"True",
		"False",
		"Not sure",
		"Are you Kidding me",
		"Uhmm, maybe",
		"B");
		question3.check();
		
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
		"What is the Full meaning of U.S.A?",
		"United State of Arab",
		"United State of Asylum",
		"United State of America",
		"United State of Africa",
		"USA",
		"C");
		question4.check();
		
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
		"Is Java Object-oriented Programming language?",
		"True",
		"False",
		"Not sure",
		"Are you Kidding me",
		"Uhmm, maybe",
		"A");
		question5.check();
		

		MultipleChoiceQuestion.showResults();
		}
	
		}
		
