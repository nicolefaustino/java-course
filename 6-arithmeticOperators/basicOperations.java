public class basicOperations{
	public static void main(String [] args){
		
		String a = "5.2";
		String b = "2.1";

		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);

		int e = (int) c;
		int f = (int) d;

		System.out.println("a: " + e);
		System.out.println("b: " + f);

		System.out.println("5 + 2 = " + (e+f));
		System.out.println("5 - 2 = " + (e-f));
		System.out.println("5 * 2 = " + (e*f));
		System.out.println("5 % 2 = " + (e%f));
	}
}