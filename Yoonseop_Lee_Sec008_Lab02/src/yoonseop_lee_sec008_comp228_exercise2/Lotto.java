package yoonseop_lee_sec008_comp228_exercise2;
import java.security.SecureRandom;

public class Lotto {
	SecureRandom randomObject = new SecureRandom(); 
	

	// Initialize int Array
	int[] array= new int[3] ;
	
	// Constructor
	public Lotto() {
		//Generate Random Array
		int randomInt = 1 + randomObject.nextInt(9);
		array[0]=randomInt;
		array[1]=randomInt;
		array[2]=randomInt;
	}
	
	public int[] returnRandomArray()
	{
		//Return Array
		return array;
	}
	
	
}
