package javaProgramming;
import java.util.Scanner;

public class purchase {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("What did you purhcase? ");
		String item = scanner.next();
		System.out.print("How many did you purchase? ");
		int quantity = scanner.nextInt();
		System.out.print("How much does each item cost? ");
		int price = scanner.nextInt();
		System.out.print("Enter the amount of cash you have: ");
		int cash = scanner.nextInt();
		scanner.close();
		
		int bill = price * quantity;
		System.out.println("\nCustomer Name: " + name);
		System.out.println("Purchased item: " + item);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		System.out.println("Total price is: " + bill);
		System.out.println("Cash: " + cash);
		
		if (bill >= 1000) {
			double discount = (bill*0.7);
			System.out.println("The total bill is: " + discount + "(Congratulations you received a 30% discount!)");
			System.out.println("The Change is: " + (cash - discount));
		}else {
			System.out.println("The total bill is: " + bill);
			System.out.println("The Change is: " + (cash - bill));
		}
	}

}
