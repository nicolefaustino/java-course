import java.util.Scanner;
public class numberWordConverter
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter a number from -9999 to 9999: ");
		int number = s.nextInt();
		
		String WD = "";

		if (number>=-9999 && number<=9999)
		{
			System.out.println();

			int numRemain = number;
			if (numRemain >= 9000)
			{
				numRemain = numRemain - 9000;
				WD = WD + " nine thousand "; 
			}
			else if (numRemain >= 8000)
			{
				numRemain = numRemain - 8000;
				WD = WD + " eight thousand "; 
			}
			else if (numRemain >= 7000)
			{
				numRemain = numRemain - 7000;
				WD = WD + " seven thousand "; 
			}
			else if (numRemain >= 6000)
			{
				numRemain = numRemain - 6000;
				WD = WD + " six thousand "; 
			}
			else if (numRemain >= 5000)
			{
				numRemain = numRemain - 5000;
				WD = WD + " five thousand "; 
			}
			else if (numRemain >= 4000)
			{
				numRemain = numRemain - 4000;
				WD = WD + " four thousand "; 
			}
			else if (numRemain >= 3000)
			{
				numRemain = numRemain - 3000;
				WD = WD + " three thousand "; 
			}
			else if (numRemain >= 2000)
			{
				numRemain = numRemain - 2000;
				WD = WD + " two thousand "; 
			}
			else if (numRemain >= 1000)
			{
				numRemain = numRemain - 1000;
				WD = WD + " one thousand "; 
			}
			if (numRemain >= 900)
			{
				numRemain = numRemain - 900;
				WD = WD + " nine hundred "; 
			}
			else if (numRemain >= 800)
			{
				numRemain = numRemain - 800;
				WD = WD + " eight hundred "; 
			}
			else if (numRemain >= 700)
			{
				numRemain = numRemain - 700;
				WD = WD + " seven hundred "; 
			}
			else if (numRemain >= 600)
			{
				numRemain = numRemain - 600;
				WD = WD + " six hundred "; 
			}
			else if (numRemain >= 500)
			{
				numRemain = numRemain - 500;
				WD = WD + " five hundred "; 
			}
			else if (numRemain >= 400)
			{
				numRemain = numRemain - 400;
				WD = WD + " four hundred "; 
			}
			else if (numRemain >= 300)
			{
				numRemain = numRemain - 300;
				WD = WD + " three hundred "; 
			}
			else if (numRemain >= 200)
			{
				numRemain = numRemain - 200;
				WD = WD + " two hundred "; 
			}
			else if (numRemain >= 100)
			{
				numRemain = numRemain - 100;
				WD = WD + " one hundred "; 
			}
			if (numRemain >= 90)
			{
				numRemain = numRemain - 90;
				WD = WD + " ninety "; 
			}
			else if (numRemain >= 80)
			{
				numRemain = numRemain - 80;
				WD = WD + " eighty "; 
			}
			else if (numRemain >= 70)
			{
				numRemain = numRemain - 70;
				WD = WD + " seventy "; 
			}
			else if (numRemain >= 60)
			{
				numRemain = numRemain - 60;
				WD = WD + " sixty "; 
			}
			else if (numRemain >= 50)
			{
				numRemain = numRemain - 50;
				WD = WD + " fifty "; 
			}
			else if (numRemain >= 40)
			{
				numRemain = numRemain - 40;
				WD = WD + " forty "; 
			}
			else if (numRemain >= 30)
			{
				numRemain = numRemain - 30;
				WD = WD + " thirty "; 
			}
			else if (numRemain >= 20)
			{
				numRemain = numRemain - 20;
				WD = WD + " twenty "; 
			}
			if (numRemain == 19)
			{
				numRemain = numRemain - 19;
				WD = WD + " nineteen "; 
			}
			if (numRemain == 18)
			{
				numRemain = numRemain - 18;
				WD = WD + " eighteen "; 
			}
			if (numRemain == 17)
			{
				numRemain = numRemain - 17;
				WD = WD + " seventeen "; 
			}
			if (numRemain == 16)
			{
				numRemain = numRemain - 16;
				WD = WD + " sixteen "; 
			}
			if (numRemain == 15)
			{
				numRemain = numRemain - 15;
				WD = WD + " fifteen "; 
			}
			if (numRemain == 14)
			{
				numRemain = numRemain - 14;
				WD = WD + " fourteen "; 
			}
			if (numRemain == 13)
			{
				numRemain = numRemain - 13;
				WD = WD + " thirteen "; 
			}
			if (numRemain == 12)
			{
				numRemain = numRemain - 12;
				WD = WD + " twelve "; 
			}
			if (numRemain == 11)
			{
				numRemain = numRemain - 11;
				WD = WD + " eleven "; 
			}
			if (numRemain == 10)
			{
				numRemain = numRemain - 10;
				WD = WD + " ten "; 
			}
			if (numRemain >= 9)
			{
				numRemain = numRemain - 1;
				WD = WD + " nine "; 
			}
			else if (numRemain >= 8)
			{
				numRemain = numRemain - 8;
				WD = WD + " eight "; 
			}
			else if (numRemain >= 7)
			{
				numRemain = numRemain - 7;
				WD = WD + " seven "; 
			}
			else if (numRemain >= 6)
			{
				numRemain = numRemain - 6;
				WD = WD + " six "; 
			}
			else if (numRemain >= 5)
			{
				numRemain = numRemain - 5;
				WD = WD + " five "; 
			}
			else if (numRemain >= 4)
			{
				numRemain = numRemain - 4;
				WD = WD + " four "; 
			}
			else if (numRemain >= 3)
			{
				numRemain = numRemain - 3;
				WD = WD + " three "; 
			}
			else if (numRemain >= 2)
			{
				numRemain = numRemain - 2;
				WD = WD + " two "; 
			}
			else if (numRemain >= 1)
			{
				numRemain = numRemain -1;
				WD = WD + " one ";
			}
			else if (numRemain == 0)
			{
				numRemain = numRemain - 0;
				WD = WD + " zero "; 
			}


				System.out.println(number + " = " + WD);
		}
		else if (number < -9999 || number > 9999) 
		{
			System.out.println("The number entered is out of range.");
		}

	}
}