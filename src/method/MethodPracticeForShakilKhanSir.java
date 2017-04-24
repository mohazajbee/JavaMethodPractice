package method;

import java.util.ArrayList;

public class MethodPracticeForShakilKhanSir {

	public static void main(String[] args) {
		//System.out.println(getName("myName"));
		System.out.println(getEvenNumber(20));
		

	}
	/**
	 * Question number:2: Write a method that take a number input and return the list of all even number from 0 to that given number
	 * parameter: int number
	 * returnType: ArrayList<Integer>
	 * servingBucket: list
	 */
	public static ArrayList<Integer> getEvenNumber (int number){
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();
		
		for (int i=0; i<=number; i=i+2){
			
			if(i % 2 == 0);
				evenNumber.add(i);
			
			
		}
		
		
		
		return evenNumber;
	}
	

	/**
	 * Question number:1: Write a method that take your name input return your
	 * name parameter: String name returnType: String servingBucket: Variable
	 */
	public static String getName(String name) {
		String myName = null;

		myName = "Mohammed Zajbee";

		return myName;

	}

}
