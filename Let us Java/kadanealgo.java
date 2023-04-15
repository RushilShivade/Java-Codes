import java.util.*;

public class kadanealgo {
    public static void main(String[] args) {
        // MAXIMUM CONTIGUOUS SUBARRAY PROBLEM
        // VERY IMPORTANT!!!

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println("0");
        } else {
            int best = arr[0], sum = arr[0];

            for (int i = 1; i < n; i++) {
                sum = Math.max(arr[i], sum + arr[i]);
                best = Math.max(best, sum);
            }
            System.out.print("The maximum sum of contiguous subarray is: " + best);
        }

    }
}
