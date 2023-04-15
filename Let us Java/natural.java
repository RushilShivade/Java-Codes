import java.util.*;

public class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till which you want to calculate the factorial: ");

        int n = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
