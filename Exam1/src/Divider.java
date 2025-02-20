import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		//This imports the scanner so save the user input
		Scanner scn = new Scanner(System.in);
		//prompts the user for first number
		System.out.println("Hello! What is the first number you are wanting to divide today?");
		//holds the info for what the user input
		double num1 = scn.nextDouble();
		//prompts the user for a second number
		System.out.println("Hello! What is the second number you are wanting to divide today?");
		//holds the user input for second number
		double num2 = scn.nextDouble();
		//gives back the 2 values divided with each other, the %.2f\n is for making the ending value only
		// have 2 decimal places.
		System.out.printf(num1 + " divided by "+ num2 + " is equal to %.2f\n", (num1/num2));

	}

}
//test positive and negative numbers
//test -9 and 7
//test 2 and 1
//test 9.2 and 7.8