import java.util.*;

public class StringsHW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.next();

        String username = "";

        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);
        
    }
    
}
