import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number to see if it is even or odd");
		
		int i = scn.nextInt();
		System.out.println("Enter a special character.");
		String str = scn.next();
		for(int j = 0; j < i; j++) {
			if((j % 2) == 0) {
				System.out.print(j + " ");
			}	
		}
		System.out.println();
		for(int k = 0; k < i; k++) {
			System.out.print(str);
		}
	}

}
