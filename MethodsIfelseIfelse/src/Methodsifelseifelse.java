import java.util.Scanner;

public class Methodsifelseifelse {

	public static void main(String[] args) {
		double lbs = 0.0;
		double result = 0.0;
		Scanner scn = new Scanner(System.in); 
		System.out.println("How much does your box weigh?");
		lbs = scn.nextDouble(); 
		
		if (lbs >= 100.0 || lbs <= 0) {
			System.out.println("That weight can not be shipped.");
		}
		if (lbs >= 50.0 && lbs <= 100.0) {
			result = lbs * 2.0; 
		}
		if (lbs >= 25.0 && lbs <= 50.0) {
			result = 35.0;
		}
		if (lbs >= 10.0 && lbs <= 25.0) {
			result = 25.0;
		}
		if (lbs > 0.0 && lbs <= 10.0) {
			result = 12.0; 
		}
		if(lbs > 0 && lbs < 100) {
		System.out.println("The total amount your delivery is going to be $" + result);
		}
	}

}
