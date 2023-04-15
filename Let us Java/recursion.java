import java.util.*;

// Backtracking bc
class Recursion {

    public static void r(int i, int n) {

        if (i < 1) {
            return;
        }
        r(i - 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        r(n, n);
    }
}