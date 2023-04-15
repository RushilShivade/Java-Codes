import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Str = scanner.next();

        for(int i= Str.length();i>0;i--){
            System.out.print(Str.charAt(i-1));
        }

    }
}