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
		Question question = new MultipleChoiceQuestion(
		"Who is the President of USA?",
		"Barrack Obama",
		"George Bush",
		"Bill Clinton",
		"Donald Trump",
		"Abraham Lincoln",
		"D");
		question.check();
		
		
		Question question2 = new MultipleChoiceQuestion(
		"What is the name of Superman?",
		"Steve Clark",
		"Kent Clark",
		"Clark Kent",
		"Ark Ent",
		"Smallville",
		"C");
		question2.check();
		
		
		Question question3 = new MultipleChoiceQuestion(
		"Is Java the same as Javascript?",
		"True",
		"False",
		"Not sure",
		"Are you Kidding me",
		"Uhmm, maybe",
		"B");
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion(
		"What is the Full meaning of U.S.A?",
		"United State of Arab",
		"United State of Asylum",
		"United State of America",
		"United State of Africa",
		"USA",
		"C");
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion(
		"Is Java Object-oriented Programming language?",
		"True",
		"False",
		"Not sure",
		"Are you Kidding me",
		"Uhmm, maybe",
		"A");
		question5.check();
		
		Question question6 = new TrueFalseQuestion(
				"Java is good",
				"True");
		question6.check();
		
		Question question7 = new TrueFalseQuestion(
				"Mark Zuckerberg is the Founder of Facebook?",
				"True");
		question7.check();
		
		Question question8 = new TrueFalseQuestion(
				"Monitor is also known as VDU",
				"True"
				);
		question8.check();
		
		Question question9 = new TrueFalseQuestion(
				"Is good to brush our teeth in the morning",
				"True"
				);
		question9.check();
		
		Question question10 = new TrueFalseQuestion(
				"Is your Daddy a woman",
				"False"
				);
		question10.check();
		

		Question.showResults();
		}
	
		}
		
