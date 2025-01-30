package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0; 
		
		System.out.println("Enter an integer");
		num1 = scn.nextInt(); 
		System.out.println("Enter a second integer");
		num2 = scn.nextInt();
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		double result3 = num1 * num2; 
		double result4 = (double)num1 / (double)num2; 
		double result5 = num1 % num2; 
		System.out.println(num1 + " + " + num2 + " = " + result1);
		System.out.println(num1 + " - " + num2 + " = " + result2);
		System.out.println(num1 + " * " + num2 + " = " + result3);
		System.out.println(num1 + " / " + num2 + " = " + result4);
		System.out.println(num1 + " % " + num2 + " = " + result5);
		
		
	}

}
