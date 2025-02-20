import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		//this is inputing whatever numbers the user enters
		Scanner scn = new Scanner(System.in);
		//this prompts the initial question
		System.out.println("Enter a value, if you wish to stop the program, enter 0");
		//setting the variables 
		int i = scn.nextInt();
		int j;
		int result = i;
		//this is the tracker to keep adding numbers until the user enters 0
		while (i != 0) {
			//creating a separate container that will keep "adding" new user input
			j = i;
			//result = i + j; trying to store multiple values in result but its not working
			System.out.println("Enter another number");
			i = scn.nextInt();
			//this stops the adding portion and continues to output the new sum of user inputs
			if (i != 0) {
				j = i;
				//i needed to open the variable back up to keep holding numbers
				i = result;
				result = i + j;
				// this helped debugging
//				System.out.println("Enter another number");
//				System.out.println(i + " " + j + " " + result);
			}
		}
		System.out.println(result);
	}

}
//test works for whole and negative numbers, having trouble keeping value...
//test 1 + 2 + 3 = 6
//test 5 + 5 + 5 = 10?... 
//added line 25 and the code works now!!
//test 10 + 12 = 22
//test -10 + 12 = 2
//test -10 + -12 = 
