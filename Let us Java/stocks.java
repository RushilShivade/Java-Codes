import java.util.*;

public class stocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minSoFar = arr[0];
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {

            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);

        }

        System.out.print(maxProfit);
    }
}
