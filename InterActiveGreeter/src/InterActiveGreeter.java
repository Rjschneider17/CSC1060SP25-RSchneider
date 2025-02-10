import java.util.Scanner;

public class InterActiveGreeter {

	public static void main(String[] args) {
		String name = ""; 
		String city = ""; 
		int age = 0;
		String act = ""; 
		int don = 0; 
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("Hello! What is your name?");
		name = scn.nextLine(); 
		System.out.println("What city are you from?");
		city = scn.nextLine();
		System.out.println("How old are you?");
		age = scn.nextInt();
		System.out.println("It is nice to meet you " + name + "! You are " + age + " years old."
				+ "I cant believe you are also from " + city + ". I dont meet many people from " + city + ".");
		System.out.println("What is your favorite activity?");
		act = scn.next();
		System.out.println("How awesome! I also enjoy " + act);
		System.out.println("How much would you like to donate today?");
		don = scn.nextInt();
		System.out.println("You are donating $" + don + ". Thank you for your donation!");
		

	}

}
