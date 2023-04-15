import java.util.*;

public class reverseArray {
    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void r(int i, int arr[], int n) {
        if (i >= n / 2) {
            return;
        }
        // swap(arr[i], arr[n - i - 1]);
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        r(i + 1, arr, n);
    }

    public static void main(String[] args) {

        int[] x = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        r(0, x, 5);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
