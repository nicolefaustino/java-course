import java.util.Scanner;

public class FAUSTINO_LAB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        printPattern(n, n - 5);

        scanner.close();
    }

    static void printPattern(int n, int limit) {
        System.out.println(n);

        if (n == limit) {
            return;
        }

        printPattern(n - 5, limit);

        System.out.println(n);
    }
}