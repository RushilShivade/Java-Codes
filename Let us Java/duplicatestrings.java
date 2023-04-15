import java.util.*;

public class duplicatestrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) (i) + " count = " + count[i]);
            }
        }
    }
}
