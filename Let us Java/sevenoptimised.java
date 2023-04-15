import java.util.*;
import java.util.Arrays;

public class sevenoptimised {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int common = 0;
        System.out.println("Enter the size of two arrays: ");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int array1[] = new int[m];
        int array2[] = new int[n];

        System.out.print("Enter elements in first array: ");

        for (int i = 0; i < m; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter elements in second array: ");

        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        Set hashSet = new HashSet(Arrays.asList(array1));
        Set commonElements = new HashSet();
        for (int i = 0; i < array2.length; i++) {
            if (hashSet.contains(array2[i])) {
                commonElements.add(array2[i]);
            }
        }

        System.out.println("The union of the two arrays is= " + (commonElements));

    }
}
