
public class WhileLoopPractice {

	public static void main(String[] args) {
		int i = 0, num1 = 4, num2 = 1;
		while (i < 5) {
			num2 = num2 * num1;
			System.out.println("i : " + i + ", next number : " + num2);
			i++;
		}
		System.out.println("Goodbye!");
		while (i < 5) {
			num2 = num2 * num1;
			System.out.println("i : " + i + ", next number : " + num2);
			i--;
		}
		System.out.println("Goodbye!");

	}

}
