import java.util.*;
public class HR5 {
    public static void main(String[] args, double t, double p) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for(int i=1;i<=q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            double temp = 1;
            for(int j =0;j<=n-1;j++)
            {
                t = (b*Math.pow(2,j-1));
                p = a + t;
                temp = temp*p;
                a = (int) temp;
                System.out.print(p);
            }
        }

        sc.close();
    }
    
}
