import java.util.Random;
import java.util.Scanner;

public class PrintFPractice {
	// printf functions and practice 

	public static void main(String[] args) {
		double myDoublenum = Math.PI;
		System.out.println(myDoublenum);
		System.out.printf("%.2f\n",myDoublenum);
		
//		 Random & math
		Random rand = new Random();
		int myRandomNumber = rand.nextInt(10);
		System.out.println(myRandomNumber); 
		System.out.printf("%05d\n", myRandomNumber);
		
		System.out.println("What is the radius of your circle?");
		double radius = 0.0; 
		Scanner scn = new Scanner(System.in);
		radius = scn.nextDouble(); 
		double area = myDoublenum * (radius * radius); 
		double per = (2 * myDoublenum * radius);
		System.out.printf("The area of your circle is %.4f\n", area);
		System.out.printf("The perameter of your circle is %.4f\n ", per);
		

	}

}
