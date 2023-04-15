import java.util.*;
import java.util.Arrays;

public class EIGHT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements in the array: ");

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int x = arr[n - 1];

        for (int i = arr.length - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }
        arr[0] = x;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
