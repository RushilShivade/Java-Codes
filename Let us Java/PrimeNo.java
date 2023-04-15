import java.util.*;

public class PrimeNo {
    public static void prime(int n)
    {
        int m=n/2, flag=0;
        if(n==0 || n==1){
            System.out.println(n + " is not a prime number");
        }
        else
        {
            for(int i=2;i<m;i++)
            {
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                }
                
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int n= scanner.nextInt();

        prime(n);

    }
    
}
