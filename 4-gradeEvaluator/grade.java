package javaProgramming;
import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Grade: ");
		String grade = scanner.next();
		scanner.close();
		
		if (grade.equals("A")) {
			System.out.println(grade + " is your grade and you are Excellent!");
		}else if (grade.equals("B")) {
			System.out.println(grade + " is your grade and you are Very Good!");
		}else if (grade.equals("C")) {
			System.out.println(grade + " is your grade and you are Good!");
		}else if (grade.equals("D")) {
			System.out.println(grade + " is your grade and you are Fair!");
		}else if (grade.equals("E")) {
			System.out.println(grade + " is your grade and you are Poor.");
		}else if (grade.equals("F")) {
			System.out.println(grade + " is your grade and you Need Improvement :(");
		}else {
			System.out.println("Error. Please input a valid grade.");
		}
	}
}
