import java.util.*;
import java.util.Arrays;

public class minimiseheight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter k: ");

        int k = scanner.nextInt();

        Arrays.sort(arr);

        int small = arr[0] + k;
        int tall = arr[n - 1] - k;

        System.out.println("Minimum height difference = " + Math.abs(tall - small));

    }
}
