package yoonseop_lee_sec008_comp228_exercise3;

import java.util.Arrays;

public class SortNumbers {

	public static void main(String[] args) {
		
		SortNumberMethod(14,31,15,16,654,35);
	}
	
	public static void SortNumberMethod(int... numbers)
	{
		 Arrays.sort(numbers); 
		 for(int index = numbers.length-1 ; index >= 0 ; index--)
		 {
			 System.out.printf("%d ",numbers[index]);
		 }
	}
	
}
