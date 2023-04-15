import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class mergearrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Size of arrays: ");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.print("Elements of array1: ");

        int arr1[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Elements of array2: ");

        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        boolean flag = true;

        while (flag == true) {
            int swap = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr1[i] > arr2[j]) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j];
                        arr2[j] = temp;
                        swap++;
                    }
                }
            }

            if (swap == 0) {
                flag = false;
            }
        }

        Arrays.sort(arr2);

        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + " ");
        }

        for (int j = 0; j < n; j++) {
            System.out.print(arr2[j] + " ");
        }

    }
}
