import java.util.*;
public class HR6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for(int i=1;i<=q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int c = a;
            for(int j =0;j<n;j++)
            {
                c = c + (int)Math.pow(2,j)*b;
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
    
}
