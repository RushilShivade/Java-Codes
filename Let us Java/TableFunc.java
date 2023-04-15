import java.util.*;
public class TableFunc {
    public static void table(int n){
        for(int i=1; i<=10; i++)
            {
            int product = n*i;
            System.out.println(n + " x " + i + " = " + product);
            }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        table(n);
    }
    
}
