public class operators {
	public static void main(String[] args) {
		
		System.out.println("Arithmetic:\n");
		System.out.println("Grouping: " + ( 3 + 4) * 2);
		System.out.println("Multiplication: " + 3 * 4 );
		System.out.println("Division: " + 15 / 5);
		System.out.println("Modulus: " + 18 % 3);
		System.out.println("Subtraction: " + (4 - 3));
		System.out.println("Addition: " + 3 + 4);
		
		System.out.println("\nRelational:");
		System.out.println(6 == 8);
		System.out.println(6 != 7);
		System.out.println(6 > 7);
		System.out.println(6 < 7);
		System.out.println(6 >= 7);
		System.out.println(6 <= 7);
		
		System.out.println("\nLogical: ");
		        boolean a = true;
		        boolean b = false;
		        
		        boolean resultAnd = a && b;
		        System.out.println(resultAnd);

		        boolean resultOr = a || b;
		        System.out.println(resultOr);

		        boolean resultNotA = !a;
		        System.out.println(resultNotA); 
		        
		        boolean resultNotB = !b;
		        System.out.println(resultNotB);
		
		System.out.println("\nIncrement & Decrement:");
		int x = 5;
		
		System.out.println("Original: " + x);
		x++;
		System.out.println("Increment: " + x);
		x--;
		System.out.println("Decrement: " + x);
		
		System.out.println("\nActivity: ");
		//System.out.println(!(((4-5+3)*10)==5) || (35/5+23) >=60 && 10==3*5);
		System.out.println(!((2*5+3)+10==5) && (5%5+2) >=5 || 10<3%2);

	}

}
