import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int n = scanner.nextInt();

        System.out.print("Enter the numbers: ");

        int minmax[] = new int[n];

        for (int i = 0; i < n; i++) {
            minmax[i] = scanner.nextInt();
        }

        int tempmin, tempmax;

        tempmin = tempmax = minmax[0];

        for (int i = 1; i <= n - 1; i++) {
            if (minmax[i] <= tempmin) {
                tempmin = minmax[i];
            }

            if (minmax[i] >= tempmax) {
                tempmax = minmax[i];
            }
        }

        System.out.println(tempmin + " " + tempmax);

    }
}