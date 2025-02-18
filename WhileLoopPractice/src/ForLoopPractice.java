
public class ForLoopPractice {

	public static void main(String[] args) {
		int i; 
		for (i = 0; i < 5; i++) {
			System.out.println("counting up i : " + i);
			if (i == 0) {
				System.out.println("Whats up!");
			}
			else if (i == 2) {
				System.out.println("its at TWO");
			}
			else {
				System.out.println("everything else");
			}
		}
		System.out.println("so whats i now? " + i);
	}

}
