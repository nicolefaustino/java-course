package javaProgramming;
import java.util.Scanner;

public class printingExercises{
	public static void main(String [] args){

		String school1 = "College of Information and Computing Sciences";
		System.out.println(school1);

		String school2 = "college of information and computing sciences";
		System.out.println(school2);

		String message = "              I love";
		System.out.println(message);

		System.out.println(school1.charAt(0));
		System.out.println(school1.length());
		System.out.println(school1.equals(school2));
		System.out.println(school1.equalsIgnoreCase(school2));
		System.out.println(message + school1);

		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string.");
		String str1 = scan.next();
		scan.close();

		System.out.println(str1.contains(school1));

		System.out.println(school2.toUpperCase());
		System.out.println(school1.toUpperCase());
		System.out.println(school2.charAt(45-1));
		System.out.println(message.charAt(0));
		System.out.println(school2.length());
		System.out.println(school2.replace('i', '!'));
		System.out.println(school1.substring(11,22));
		System.out.println(message.trim());
		System.out.println(message.length());
		System.out.println(school1.compareTo(school2));
		System.out.println(message.substring(16,20));
	}
}