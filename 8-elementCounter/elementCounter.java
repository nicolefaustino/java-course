import java.util.Scanner;

public class FAUSTINO_LAB1 {

    public static void main(String[] args) {
        System.out.println("Faustino, Nicole Adi C.");
        Scanner read = new Scanner(System.in);

        System.out.print("How many elements in the array?: ");
        int n = read.nextInt();

        int[] array = new int[n];
        System.out.println("Input the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = read.nextInt();
        }

        int firstElement = array[0];
        int count = Greater(array, 1, firstElement);
        System.out.println("Number of integers greater than the first element: " + count);
    }

    public static int Greater(int[] array, int index, int firstElement) {
        if (index >= array.length) {
            return 0;
        }

        int count = array[index] > firstElement ? 1 : 0;
        count += Greater(array, index + 1, firstElement);

        return count;
    }
}
