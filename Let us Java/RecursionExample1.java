import java.util.*;

public class RecursionExample1 {

    public static void p(int n) {
        if (n < 1) {
            return;
        }
        System.out.println("hello");
        p(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p(n);
    }
}