package yoonseop_lee_sec008_comp228_exercise2;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		
		int count=0;
		int sum;
		int userNumber;
		do   
		{
		System.out.println("Enter 3~27");
		userNumber = userInput.nextInt();
		Lotto lotto1= new Lotto();
		int[] array = lotto1.returnRandomArray();
		sum = array[0] + array[1] + array[2];
			if(userNumber==sum)
			{
				System.out.println("Win");
			}
			else
			{
				System.out.println("Lose");
			}
			count++;
		}while(!(userNumber==sum || count >=5));
		
		userInput.close();
		
	}

}
