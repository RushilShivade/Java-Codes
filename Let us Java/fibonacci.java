import java.util.*;

public class fibonacci {

    public static int r(int x) {
        if (x <= 1) {
            return x;
        } else {
            return r(x - 1) + r(x - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(r(x));
    }
}
