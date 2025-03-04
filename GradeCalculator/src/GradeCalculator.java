import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Hello, What is the grade percentage you currently have in your class?");
		int grade = 0;
		grade = scn.nextInt();
		System.out.println("Your grade is currently " + (gradecal(grade)));
	}
	public static String gradecal(int grade) {
		if(grade >= 92 && grade < 101) {
			return "A"; 
		}
		else if (grade >= 89 && grade < 92) {
			return "A-"; 
		}
		else if(grade >= 87 && grade < 89) {
			return "B+";
		}
		else if (grade >= 79 && grade < 87) {
			return "B";
		}
		else if(grade >= 77 && grade < 79) {
			return "B-";
		}
		else if (grade >= 72 && grade < 77) {
			return "C+";
		}
		else if(grade >= 69 && grade < 72) {
			return "C";
		}
		else if(grade >= 67 && grade < 69) {
			return "C-";
		}
		else if(grade >= 60 && grade < 67) {
			return "D+";
		}
		else if (grade >= 0 && grade < 60) {
			return "F";
		}
		return "invalid grade";
	}

}
