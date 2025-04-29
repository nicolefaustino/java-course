import java.util.Locale;
import java.util.Scanner;

public class VowelCounter {

    // to count total number of vowels
    static int countVowels(String str, int cntr, int total)
    {
        if(cntr<0){
            return total;
        }else{
            char ch = str.charAt(cntr);
            ch = Character.toUpperCase(ch);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                total++;
            }

            cntr--;

            return countVowels(str, cntr, total);
        }
    }

    // to count total number of consonants
    static int countConsonants(String str, int cntr, int total)
    {
        if(cntr<0){
            return total;
        }else{
            char ch = str.charAt(cntr);
            ch = Character.toUpperCase(ch);
            // check if character is in between a to z
            if ((ch >= 'A' && ch <= 'Z' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')) {
                total++;
            }

            cntr--;

            return countConsonants(str, cntr, total);
        }
    }

    // to count total number of spaces
    static int countSpaces(String str, int cntr, int total)
    {
        if(cntr<0){
            return total;
        }else{
            char ch = str.charAt(cntr);

            // check if character is in between a to z
            if (ch == ' ' ) {
                total++;
            }

            cntr--;

            return countSpaces(str, cntr, total);
        }
    }

    static int countDigits(String str, int cntr, int total)
    {
        if(cntr<0){
            return total;
        }else{
            char ch = str.charAt(cntr);

            // check if character is in between a to z
            if (ch >= '0' && ch <= '9') {
                total++;
            }

            cntr--;

            return countDigits(str, cntr, total);
        }
    }

    // to count total number of special characters
    static int countSpecialchar(String str, int cntr, int total)
    {
        if(cntr<0){
            return total;
        }else{
            char ch = str.charAt(cntr);
            ch = Character.toUpperCase(ch);
            // check if character is in between a to z
            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= '0' && ch <= '9') && ch != ' ') {
                total++;
            }

            cntr--;

            return countSpecialchar(str, cntr, total);
        }
    }

    // Main Calling Function
    static public void main(String[] args)
    {
        String str;
        int cntr, total=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        str = sc.nextLine();

        cntr = str.length();

        System.out.println("No. of Vowels: " + countVowels(str, cntr-1, total));
        System.out.println("No. of Consonants: " + countConsonants(str, cntr-1, total));
        System.out.println("No. of Spaces: " + countSpaces(str, cntr-1, total));
        System.out.println("No. of Digits: " + countDigits(str, cntr-1, total));
        System.out.println("No. of Special Characters: [i.e. Symbols, Punctuations, etc.] " + countSpecialchar(str, cntr-1, total));
    }



}
