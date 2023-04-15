import java.util.*;

public class kedane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of array: ");

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println("0");
        }

        else {
            int best = arr[0], sum = arr[0];

            for (int i = 1; i < n; i++) {
                sum = Math.max(arr[i], sum + arr[i]);
                best = Math.max(sum, best);
            }
            System.out.println(best);
        }
    }
}
