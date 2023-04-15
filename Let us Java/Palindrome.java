import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string S: ");
        String string = scanner.next();

        String str;

        for (int i = string.length() - 1; i > 0; i--) {
            System.out.print(string.charAt(i - 1));
        }

    }
}
