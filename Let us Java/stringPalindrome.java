import java.util.*;

public class stringPalindrome {

    public static boolean r(String str, int x, int i) {

        if (i >= x / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(x - i - 1)) {
            return false;

        }
        return r(str, x, i + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String str = sc.nextLine();
        int x = str.length();

        System.out.println(r(str, x, i));
    }
}
