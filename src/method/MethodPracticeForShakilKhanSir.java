package method;

import java.util.ArrayList;

public class MethodPracticeForShakilKhanSir {

	public static void main(String[] args) {
		// System.out.println(getName("myName"));
		// System.out.println(getEvenNumber(20));
		// System.out.println(getOddNumber(20));
		// System.out.println(getKilometer(12));
		// System.out.println(getTextUpperCase("my name is zajbee"));
		// System.out.println(getLowerCase("My Name Is Zajbee"));
		// System.out.println(getAllIndex("My name is Zajbee"));
		// System.out.println(getCharacterList("My name is Zajbee"));
		// System.out.println(getSumNumber(16));
		// System.out.println(getSquareNumber(8));

	}

	/**
	 * Question number:10: Write a method that take one number input and return
	 * square of the given number parameter: int number returnType: int
	 * servingBucket: variable
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
