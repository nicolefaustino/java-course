package javaProgramming;
import java.util.Scanner;

public class charCounter{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = scanner.nextLine();
		scanner.close();
		
		int vowelCounter = countVowels(string);
		int consonantCounter = countConsonants(string);
		int spaceCounter = countSpace(string);
		int specialCounter = countSpecial(string);
		int digitCounter = countDigit(string);
		
		System.out.println("Vowels: " + vowelCounter);
		System.out.println("Consonants: " + consonantCounter);
		System.out.println("Spaces: " + spaceCounter);
		System.out.println("Special Characters: " + specialCounter);
		System.out.println("Digits: " + digitCounter);		
	}
	public static int countVowels (String str) {
		str.toLowerCase();
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
		
	}
	public static int countConsonants(String str) {
		str.toLowerCase();
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z' && ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				count++;
			}
		}
		return count;
	}
	public static int countSpace(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				count++;
			}
		}
		return count;
	}
	public static int countSpecial(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
				count++;
			}
		}
		return count;
	}
	public static int countDigit(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
}