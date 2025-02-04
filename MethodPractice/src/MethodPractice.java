
public class MethodPractice {

	public static void main(String[] args) {
		int testNum = 0;
		System.out.println(10);
		testNum = printLines(1); 
		System.out.println("end of printLine method");
		printLines(testNum); 
		System.out.println("New end of method");

	}
	static int printLines (int returnNum) {
		System.out.println();
		System.out.println();
		return returnNum*2; 
	}
}
