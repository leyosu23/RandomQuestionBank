package yoonseop_lee_sec008_comp228_exercise1;
import java.security.SecureRandom;
import java.util.Scanner;


public class QuestionBank {
	static SecureRandom randomObject = new SecureRandom(); 
	
	// fields
	 int numOfCorrectAnswer;
	
	public void inputAnswer() {  
		simulateQuestion();
		System.out.printf("\nYou got %s out of 5 ,which is %s%s" ,numOfCorrectAnswer ,numOfCorrectAnswer*100/5 ,"%");
	}
	
	public void simulateQuestion() {   
		Scanner input = new Scanner(System.in);
		
		//Question Array
		String[] QuestionBank = new String[5];
		QuestionBank[0] = "Q1: Information is passed to a method in ________\n"
				+ "1. the method name\r\n"
				+ "2. that method¡¯s return\r\n"
				+ "3. the method body\r\n" 
				+ "4. the arguments to the method\r\n";
		QuestionBank[1] = "Q2: A well-designed method ________\n"
				+ "1. performs multiple unrelated tasks\r\n" 
				+ "2. repeats code found in other methods\r\n"
				+ "3. contains thousands of lines of code\r\n"
				+ "4. performs a single, well-defined task\r\n";
		QuestionBank[2] = "Q3: To declare a method as static, place the keyword static before ________ in the method¡¯s declaration.\n"
				+ "1. the method modifier\r\n"
				+ "2. the return type\r\n" 
				+ "3. the method name\r\n"
				+ "4. the argument list\r\n";
		QuestionBank[3] = "Q4: Which is a correct static method call of Math class method sqrt?\n"
				+ "1. sqrt(900);\r\n"
				+ "2. math.sqrt(900);\r\n"
				+ "3. Math.sqrt(900);\r\n"
				+ "4. Math math = new Math(); math.sqrt(900);\r\n";
		QuestionBank[4] = "Q5: Which of the following methods is not in the Math class?\n"
				+ "1. ceil\r\n" 
				+ "2. abs\r\n" 
				+ "3. parseInt\r\n" 
				+ "4. log\r\n";
		
		// Answer Array
		int[] AnswerBank = new int[5];
		AnswerBank[0] = 4;
		AnswerBank[1] = 4;
		AnswerBank[2] = 2;
		AnswerBank[3] = 3;
		AnswerBank[4] = 3;
		
		// the number questions created for each question in order to avoid question rebundancy
		 int countOne =0;
		 int countTwo =0;
		 int countThree =0;
		 int countFour =0;
		 int countFive =0;
		 int RandomQuestionNumber;
		 // Simulate random 5 Questions
		 for (int numberOfQuestions=0 ; numberOfQuestions<5 ; numberOfQuestions++) {
			 boolean overLapped = false;
			do{
				// Generate random number
				 RandomQuestionNumber = randomObject.nextInt(5);
				 
				 //Check the questions created so far is overlapped (each question only show up one time)
				 if (RandomQuestionNumber==0)
				 {
					 countOne++;
					 if(countOne>1) { overLapped= true; }
					 else { overLapped = false; }
				 }
				 else if (RandomQuestionNumber==1)
				 {
					 countTwo++;
					 if(countTwo>1) { overLapped= true; }
					 else { overLapped = false; }
				 }
				 else if (RandomQuestionNumber==2)
				 {
					 countThree++;
					 if(countThree>1) { overLapped= true; }
					 else { overLapped = false; }
				 }
				 else if (RandomQuestionNumber==3)
				 {
					 countFour++;
					 if(countFour>1) { overLapped= true; }
					 else { overLapped = false; }
				 }
				 else
				 {
					 countFive++;
					 if(countFive>1) { overLapped= true; }
					 else { overLapped = false; }
				 }
			 }while(overLapped);
			 
			 // Show up Question
	         System.out.printf("%s", QuestionBank[RandomQuestionNumber]);
	         // Take user choice
	      int userChoice = input.nextInt();
	      // check the user answer correct or not
	      checkAnswer(userChoice , AnswerBank[RandomQuestionNumber]);
	      }
		input.close();
	}
	
	// Check answer and show up correct or not
	// Also accumulate correct answers so far
	public void checkAnswer(int userChoice, int answer) { 
		if(userChoice == answer)
		{
			boolean collectOrNot = true;
			System.out.println(generateMessage(collectOrNot));
			numOfCorrectAnswer++;
		}
		else
		{
			boolean collectOrNot = false;
			System.out.println(generateMessage(collectOrNot));
		}
	}
	
	// Generate Random Message 
	public String generateMessage(boolean collectOrNot) { 
		if(collectOrNot)
		{
			switch ( randomObject.nextInt( 4 ) )
			{
				case 0:
				return("\nExcellent!\n");
				case 1:
					return("\nGood!\n");
				case 2:
					return("\nKeep up the good work!\n");
				case 3:
					return("\nNice work!\n");
				default:
					return("");
			}
		}
		else
		{
			switch ( randomObject.nextInt( 4 ) )
			{
			case 0:
				return("\nNo. Please try again\n");
			case 1:
					return("\nWrong. Try once more\n");
			case 2:
					return("\nDon't give up!\n");
			case 3:
					return("\nNo. Keep trying..\n");
			default:
				return("");
			}
		}
		
	}
	
}

