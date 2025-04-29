import java.util.Scanner;

public class arrayAnalysis {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("What is the size of your array? ");
		
		int size = scanner.nextInt();		
		int[] array = new int[size];
		System.out.println("Enter " + size + " integers: ");
		
		for (int i = 0; i < size; i++){
			array[i] = scanner.nextInt();
		}
		scanner.close();
	
		if (array.length > 0) {
			int firstElement = array[0];
			int count = 0;
			for (int i = 1; i < array.length; i++) {
				if (array[i] > firstElement) {
					count++;
		}
	}
			System.out.println("Number of integers greater than the first integer: " + count);
}
		
	}
}