import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        num = sc.nextInt();
        factorial(num);
    
    }
    static void factorial(int num)
    {
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
            
        }
        System.out.println("The factorial of the number is:" + fact);
    
    }
    
}
