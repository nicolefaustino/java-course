import java.util.Scanner;
public class Modulo{
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the 1st integer:");
		int int1 = scan.nextInt();

		System.out.println(int1);

		System.out.println("Please enter the second integer:");
		int int2 = scan.nextInt();

		System.out.println(int2);

		float quotient = (float) int1 / int2;
		System.out.printf("Quotient =%.4f.", quotient);
	}
}
