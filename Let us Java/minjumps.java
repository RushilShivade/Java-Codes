import java.util.*;
import java.util.Arrays;

public class minjumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

    }
}
