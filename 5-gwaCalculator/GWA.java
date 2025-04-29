package javaProgramming;
import java.util.Scanner;

public class GWA {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your section: ");
		String section = scanner.nextLine();
		System.out.print("Enter your grade for English: ");
		int english = scanner.nextInt();
		System.out.print("Enter your grade for Filipino: ");
		int filipino = scanner.nextInt();
		System.out.print("Enter your grade for Computer: ");
		int computer = scanner.nextInt();
		System.out.print("Enter your grade for Science: ");
		int science = scanner.nextInt();
		System.out.print("Enter your grade for Math: ");
		int math = scanner.nextInt();
		scanner.close();
		
		System.out.println("\nName: " + name);
		System.out.println("Section: " + section);
		System.out.println("GWA: " + (english + filipino + computer + science + math) / 5);
	}
}
