import java.util.Scanner;

public class WhileForLoops {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a value, if you wish to stop the program, enter 0");
		
		int i = 1;
		int j;
		int result = i;
		
		while (i != 0) {
			j = i;
			System.out.println("Enter another number");
			i = scn.nextInt();
			if (i != 0) {
				//j = i;
				result = i * j;
				// this helped debugging
//				System.out.println("Enter another number");
//				System.out.println(i + " " + j + " " + result);
			}
		}
		System.out.println(result);

	}

}
