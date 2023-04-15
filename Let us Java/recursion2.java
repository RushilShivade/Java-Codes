import java.util.*;

public class recursion2 {
    public static void r(int i, int sum, int s) {
        if (i > s) {
            System.out.println(sum);
            return;
        } else {
            r(i + 1, sum + i, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        r(1, 0, s);
    }
}
