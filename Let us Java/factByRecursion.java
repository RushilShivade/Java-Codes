import java.util.*;

public class factByRecursion {
    public static int r(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * r(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println(r(x));
    }
}
