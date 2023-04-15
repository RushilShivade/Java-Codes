import java.util.*;

public class fifth {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array");

        int n = scanner.nextInt(); // size of array

        System.out.print("Enter the numbers in the array: ");

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                x++;
            }

            if (array[i] == 1) {
                y++;
            }

            if (array[i] == 2) {
                z++;
            }
        }

        int sortedArray[] = new int[n];
        for (int i = 0; i < x; i++) {
            sortedArray[i] = 0;
        }

        for (int i = x; i < x + y; i++) {
            sortedArray[i] = 1;
        }

        for (int i = x + y; i < x + y + z; i++) {
            sortedArray[i] = 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sortedArray[i]);
        }
    }
}
