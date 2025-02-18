
public class SumOfWhileNumbers {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i <= 10) {
			sum = i + sum;
			i++;
//			if(i == 10) {
//				System.out.println(i);
			}
		System.out.println(sum);
		}
	}
