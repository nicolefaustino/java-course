package javaProgramming;
import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a temperature in Farenheit: ");
		float farenheit = scanner.nextFloat();
		scanner.close();
		
		System.out.println("This temperature in Celcius is: " + ((farenheit - 32) * (5 / 9)));
	}
}
