import java.util.*;

class BinarySearch {
    public static int BSearch(int[] arr, int n, int key) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            else if (key > arr[mid]) {
                start = mid + 1;
            }

            else if (key < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int odd[] = { 1, 2, 3, 4, 5, 6, 7 };
        int even[] = { 1, 2, 3, 4, 5, 6 };

        // int res = BSearch(odd, 7, 6);

        // System.out.println("The number is at index: " + res);

        System.out.println(BSearch(odd, 7, 6));

    }

}