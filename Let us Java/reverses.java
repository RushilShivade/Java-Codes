import java.util.*;

public class reverses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the letter: ");

        String str = scanner.next();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
