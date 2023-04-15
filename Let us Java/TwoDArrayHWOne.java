import java.util.*;
public class TwoDArrayHWOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int TwoDArrayHWOne[][] = new int[rows][cols];

        for(int i=0; i<rows;i++){

            for(int j=0;j<cols;j++){
                TwoDArrayHWOne[i][j] = sc.nextInt();
            }
        }

        
        for(int i=0; i<rows;i++){

            for(int j=0;j<cols;j++){
                System.out.print(TwoDArrayHWOne[j][i] + " ");
            }
            System.out.println();
        }



    }
    
}
