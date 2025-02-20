import java.util.Random;
import java.util.Scanner;

public class CircleCalculations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int unicirc = 0;
		System.out.println("Are you wanting the 1.)diameter, 2.)area, or 3.)circumfrence?");
		unicirc = scn.nextInt();
		System.out.println("What is the radius of the circle?");
		int rad = 0;
		rad = scn.nextInt();
		
		double pie = Math.PI;
		
		if(unicirc == 1) {
			System.out.println(circleDia(rad));
		}
		if(unicirc == 2) {
			System.out.println(circleArea(rad, rad));
		}
		if(unicirc == 3) {
			System.out.println(circleCir(rad, pie));
		}
		
		

	}
	public static int circleDia(int rad) {
		int diameter = rad * 2;
		return diameter;
	}
	public static double circleArea(int rad, double pie) {
		double pi = Math.PI;
		double area = ((double)pi * ((double)rad * (double) rad)); 
		return area;
		
	}
	public static int circleCir(int rad, double pie) {
		double pi = Math.PI;
		double cir = 2 * (pi * rad);
		return (int) cir;
	}

}
