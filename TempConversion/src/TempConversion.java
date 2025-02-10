import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) { 
		double temp = 0.0;
		int conv = 0;
		Scanner scn = new Scanner(System.in); 
		
		System.out.println("What is the exact temp?");
		temp = scn.nextDouble();
		System.out.println("What units is the temp in? Enter: 0=Far, 1=Cel, or 2=Kel");
		conv = scn.nextInt();
		
		if(conv == 0) {
			System.out.println("The temp in Celcius is " + ((temp - 32) * (5/9)));
			System.out.println("The temp in Kelivin is " + ((5/9) * (temp - 32)) + 273);
		}
		if(conv == 1) {
			System.out.println("The temp in Fahrenheit is " + ((9/5) * temp) + 32);
			System.out.println("Them temp in Kelvin is " + (temp + 273));
		}
		if(conv == 2) {
			System.out.println("The temp in Farenheit is " + ((9/5) * temp + 32));
			System.out.println("The temp in Celcius is " + (temp - 273));
		}
		
	}

}
//Celsius to Fahrenheit	° F = 9/5 ( ° C) + 32
//Kelvin to Fahrenheit	° F = 9/5 (K - 273) + 32
//Fahrenheit to Celsius	° C = 5/9 (° F - 32)
//Celsius to Kelvin	K = ° C + 273
//Kelvin to Celsius	° C = K - 273
//Fahrenheit to Kelvin	K = 5/9 (° F - 32) + 273