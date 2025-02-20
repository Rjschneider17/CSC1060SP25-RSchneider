import java.io.PrintStream;
import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		//prompts user for beverage selector
		System.out.println("Hello! Which bevverage would you like to select today? "
				+ "Please choose 1.)soda, 2.)Ice tea, or 3.)Lemonade.");
		//initializing variables to print out string arguments
		String soda = null;
		String tea = null;
		String lem = null;
		//printing statement to tell the user what the selected 
		System.out.println("Thank you for choosing " + (pickBev(soda, tea, lem) + 
				", Have a nice day!"));
		

	}
	//method to decide what beverage the user is selecting
	public static String pickBev(String soda, String tea, String lem) {
		Scanner scn = new Scanner(System.in);
		//holds what user inputed
		int bev = scn.nextInt();
		//if statement to decide what beverage the user is asking for 
		if(bev == 1) {
			return "soda";
		//else if statement to decide if they want ice tea
		}else if(bev == 2) {
			return "Ice tea";
		//ending return statement if answer was not 1 or 2
		}else if(bev == 3){
			return "Lemonade";
		}else {
			return "please try again";
		}
	}
}
//test 1, 2, and 3
//test 4, came back funky, "Thank you for choosing please try again Have a nice day!""