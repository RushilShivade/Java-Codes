public class Pattern2 {
    public static void main(String[] args) {
        for(int j=0; j<4;j++)
        {
            if(j==0 || j==3)
            {
                for(int i=0; i<5;i++){
                    System.out.print("*");
                }
                
            }
            else
            {
                System.out.print("*   *");
            }
            System.out.println();

            
        }
        
    }    
}
//R.S.



// More efficient way. From h/w.
// import java.util.*;
 
// public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//        int m = 4;
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
// }

