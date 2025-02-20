package calculator;

public class operationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		x = x + 1;
		x = x * 2;
		x = 30 - x;
		System.out.println(x);
		System.out.println(calc(4,5) + "\t" + calc(1,2));
		double num1 = 1 + (int)3.5/2;
		System.out.println(num1);
		

	}
	public static int calc( int num1, int num2) {
		return 1 + num1 + num2;
	}
	

}
