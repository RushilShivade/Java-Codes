import java.util.*;
import java.util.Arrays;

public class kth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array");

        int n = scanner.nextInt(); // size of array

        System.out.println("Enter the value of k (k<n):");

        int k = scanner.nextInt();

        System.out.print("Enter the numbers in the array: ");

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("The kth smallest element in the array is = " + array[k - 1]);

    }
}
