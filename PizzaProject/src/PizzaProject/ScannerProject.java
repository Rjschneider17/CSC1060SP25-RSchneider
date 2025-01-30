package PizzaProject;

import java.util.Scanner;

public class ScannerProject {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String mystring; 
		int Mynum;
		double myDouble; 
		
		System.out.println("What is your name?");
		mystring = scn.next();
		System.out.println("Hello " + mystring + ", it is nice to meet you!");
		System.out.println("How old are you?");
		Mynum = scn.nextInt();
		System.out.println("Thats crazy, I am also " + Mynum + " years old.");
		System.out.println("Do you know what 10 - 9.5 equals?");
		myDouble = scn.nextDouble(); 
		System.out.println("Correct! The answer is " + myDouble);
	}

}
