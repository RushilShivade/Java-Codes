import java.util.*;
import java.util.Arrays;

public class duplicateno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (a[i] == a[j]) {
        // System.out.println(a[i]);
        // }
        // }
        // }

        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int x = a[i];
            b[x]++;
            if (b[x] > 1) {
                System.out.println(x);
                break;
            }
        }
    }
}
