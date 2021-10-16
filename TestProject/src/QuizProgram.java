import javax.swing.JOptionPane;
public class QuizProgram {
	public static void main(String[] args) {
		String yesOrNo1;
		String answerOne;
		int marks=0;
		JOptionPane.showMessageDialog(null,"Welcome to The Quiz Program");
		do {
			yesOrNo1 = JOptionPane.showInputDialog("Are you ready?(yes/no)");
			}while(!yesOrNo1.equalsIgnoreCase("yes")&&!yesOrNo1.equalsIgnoreCase("no"));
		if(yesOrNo1.equalsIgnoreCase("yes")) 
		{
			JOptionPane.showMessageDialog(null,"Question 1: Type in A for option A and B for Option B");
			answerOne = JOptionPane.showInputDialog("What is the height of Mount Everest?\nA. 8848 metres	\nB.8884 metres").toLowerCase();
			switch (answerOne) {
				case "a":
					JOptionPane.showMessageDialog(null,"CORRECT");
					marks = marks+10;
					break;
				case "b":
					JOptionPane.showMessageDialog(null,"INCORRECT");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Incorrect option selected");
			}
			JOptionPane.showMessageDialog(null,"Question 2: Type in A for option A and B for Option B");
			answerOne = JOptionPane.showInputDialog("How many continents are there?\nA. 6 continents	\nB.7 continents").toLowerCase();
			switch (answerOne) {
				case "a":
					JOptionPane.showMessageDialog(null,"INCORRECT");
					break;
				case "b":
					JOptionPane.showMessageDialog(null,"CORRECT");
					marks = marks+10;
					break;
				default:
					JOptionPane.showMessageDialog(null,"Incorrect option selected");
			}
			JOptionPane.showMessageDialog(null,"Question 3: Type in A for option A and B for Option B");
			answerOne = JOptionPane.showInputDialog("What is the capital of Australia?\nA. Canberra	\nB. Sydney").toLowerCase();
			switch (answerOne) {
				case "a":
					JOptionPane.showMessageDialog(null,"CORRECT");
					marks = marks + 10;
					break;
				case "b":
					JOptionPane.showMessageDialog(null,"INCORRECT");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Incorrect option selected");
					}
			
			if(marks==30) {
				JOptionPane.showMessageDialog(null,"Congratulation, You got all of them correct");
			}else
				if(marks==20) {
				JOptionPane.showMessageDialog(null,"You got 2 of them correct");
			}else
				if(marks==10){
					JOptionPane.showMessageDialog(null,"You got 1 of them correct");
				}else
					if(marks==0) {
						JOptionPane.showMessageDialog(null,"You got none of them correct");
					}
	}else
		{
			JOptionPane.showMessageDialog(null,"Good bye");
		}

}
}