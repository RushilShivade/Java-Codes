import java.io.*;
import java.util.*;

public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array");

        int n = scanner.nextInt(); // size of array

        System.out.print("Enter the numbers in the array: ");

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int narray[] = new int[n];
        int parray[] = new int[n];
        int x = 0;
        int y = 0;

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {

                stack1.push(array[i]);
            } else if (array[i] >= 0) {

                stack2.push(array[i]);
            }
        }

        System.out.print(stack1 + " " + stack2);

    }
}
