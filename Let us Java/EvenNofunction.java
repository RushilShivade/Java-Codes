import java.util.*;
public class EvenNofunction {
    public static void evenNo(int n) {
        if(n==0){
            System.out.println(n + " is niether odd nor even.");
        }
        else if(n%2==0){
            System.out.println(n + " is an even number.");
        }
        else{
            System.out.println(n + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        evenNo(n);
    }
}
