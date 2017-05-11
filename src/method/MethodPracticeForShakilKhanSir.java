package method;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPracticeForShakilKhanSir {

	public static void main(String[] args) {
		System.out.println("Exercise no 1: " + getName("myName"));
		System.out.println("Exercise no 2: " + getEvenNumber(20));
		System.out.println("Exercise no 3: " + getOddNumber(20));
		System.out.println("Exercise no 4: " + getKilometer(12));
		System.out.println("Exercise no 5: " + getTextUpperCase("my name is zajbee"));
		System.out.println("Exercise no 6: " + getLowerCase("My Name Is Zajbee"));
		System.out.println("Exercise no 7: " + getAllIndex("My name is Zajbee"));
		System.out.println("Exercise no 8: " + getCharacterList("My name is Zajbee"));
		System.out.println("Exercise no 9: " + getSumNumber(16));
		System.out.println("Exercise no 10: " + getSquareNumber(8));
		System.out.println("Exercise no 11: " + Arrays.toString(getNumberArray(10)));
		System.out.println("Exercise no 12: " + getNumberList(10));
		System.out.println("Exercise no 13: " + getResult(13));
		int[] numbArray = new int[5];
		int[] numArray = {12, 15, 2, 25};
		
		System.out.println("Exercise no 14: " +getMaxNumber(numArray));

	}
	/**
	 * Question number: 14: Write a method that take one number array input and return the max number
	 * parameter: int[] numArray
	 * returnType: int
	 * servingBucket:variable
	 */
	public static int getMaxNumber(int[] numArray){
		int maxNumber = 0;
		Arrays.sort(numArray);
		int lastIndex = numArray.length-1;
		maxNumber = numArray[lastIndex];
		
		return maxNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * Question number 13: Write a method that take one number input and return
	 * fizz if the given number divided by 5 and return buzz if the given number
	 * divided by 5&&3 other wise return buzz fizz 
	 * 
	 * parameter: int number
	 * 
	 * returnType: String
	 * 
	 * servingBucket: variable
	 */
	public static String getResult(int number) {
		
		String result = null;
		
		if ( number % 5 == 0 && number % 3 == 0 ){
			
			result = "buzz";
		} else if 
			(number % 5 == 0){
				
				result = "fizz";
			} else {
				result = "buzz fizz";
			}
		

		return result;
	}

	/**
	 * Question number 12: Write a method that take one number input and return
	 * a number list starting from 0 to that given number parameter: int number
	 * returnType: ArrayList<Integer> servingBucket: list
	 */
	public static ArrayList<Integer> getNumberList(int number) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 1; i <= number; i = i + 1) {

			numberList.add(i);
		}

		return numberList;

	}

	/**
	 * Question number 11: Write a method that take one number input and return
	 * an Array that contains 0 to given number parameter: int number
	 * returnType: int[] servingBucket: Array
	 */
	public static int[] getNumberArray(int number) {
		int[] numberArray = new int[number];
		for (int i = 1; i <= number; i = i + 1) {

			numberArray[i - 1] = i;

		}

		return numberArray;
	}

	/**
	 * Question number:10: Write a method that take one number input and return
	 * square of the given number parameter: int number returnType: int
	 * servingBucket: list
	 */
	public static int getSquareNumber(int number) {

		int squareNumber = 0;

		squareNumber = number * number;

		return squareNumber;
	}

	/**
	 * Question number 9: Write a method that take a number input and return the
	 * sum of 1 to that given number parameter: int number returnType: int
	 * serving Bucket: Variable
	 */
	public static int getSumNumber(int number) {
		int sumNumber = 0;

		for (int i = 0; i <= number; i = i + 1) {

			sumNumber = sumNumber + i;
		}

		return sumNumber;
	}

	/**
	 * Question number:8: Write a method that take one string input and return
	 * the list of all Characters parameter: String text returnType:
	 * ArrayList<Character> servingBucket: list
	 */
	public static ArrayList<Character> getCharacterList(String text) {
		ArrayList<Character> characterList = new ArrayList<Character>();

		int lastIndex = text.length() - 1;

		for (int i = 0; i <= lastIndex; i = i + 1) {

			characterList.add(text.charAt(i));

		}

		return characterList;
	}

	/**
	 * Question number: 7: Write a method that take one String input and return
	 * a list of all index parameter: String text returnType: ArrayList<Integer>
	 * servingBucket: list
	 */
	public static ArrayList<Integer> getAllIndex(String text) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();

		int lastIndex = text.length() - 1;

		for (int i = 0; i <= lastIndex; i = i + 1) {
			indexList.add(i);

		}

		return indexList;
	}

	/**
	 * Question number: 6: Write a method that take one string input and return
	 * same string in lower case parameter: String text returnType: String
	 * servingBucket: variable:
	 */
	public static String getLowerCase(String text) {
		String lowerCase = null;

		lowerCase = text.toLowerCase();

		return lowerCase;
	}

	/**
	 * Question number: 5: Write a method that take one string input and return
	 * same string in upper case. parameter: String text returnType: String
	 * servingBucket: variable
	 */
	public static String getTextUpperCase(String text) {
		String upperCase = null;

		upperCase = text.toUpperCase();

		return upperCase;
	}

	/**
	 * Question number: 4: Write a method that take input as mile and return as
	 * kilometer parameter: double mile returnType: double servingBucket:
	 * variable
	 */
	public static double getKilometer(double mile) {

		double kilometer = 0;

		kilometer = mile * 1.61;

		return kilometer;
	}

	/**
	 * Question number: 3: Write a method that take a number input and return
	 * the list of all odd number from 0 to that given number parameter: int
	 * number returnType: ArrayList<Integer> servingBucket: lsit
	 */
	public static ArrayList<Integer> getOddNumber(int number) {

		ArrayList<Integer> oddNumber = new ArrayList<Integer>();

		for (int i = 0; i < number; i = i + 1) {

			if (i % 2 == 1) {

				oddNumber.add(i);
			}
		}

		return oddNumber;
	}

	/**
	 * Question number:2: Write a method that take a number input and return the
	 * list of all even number from 0 to that given number parameter: int number
	 * returnType: ArrayList<Integer> servingBucket: list
	 */
	public static ArrayList<Integer> getEvenNumber(int number) {
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();

		for (int i = 0; i <= number; i = i + 2) {

			if (i % 2 == 0)
				;
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
