import java.util.*;

public class ReverseStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();

        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Output = " + reverse);
    }
}
