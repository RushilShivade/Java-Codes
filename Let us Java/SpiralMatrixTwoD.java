import java.util.*;
public class SpiralMatrixTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int spiral[][] = new int[rows][cols];

        for(int i=0; i<rows;i++){

            for(int j=0;j<cols;j++){
                spiral[i][j] = sc.nextInt();
            }
        }
        int row_start = 0;
        int row_end = rows-1;
        int col_start = 0;
        int col_end = cols-1;

        while(row_start<= row_end && col_start<=col_end){

            for(int col=col_start; col<=col_end; col++){
                System.out.print(spiral[row_start][col] + " ");
            }
            row_start++;

            for(int row=row_start; row<= row_end;row++){
                System.out.print(spiral[row][col_end]+ " ");
            }
            col_end--;

            for(int col=col_end;col>=col_start;col--){
                System.out.print(spiral[row_end][col]+ " ");
            }
            row_end--;

            for(int row=row_end;row>=row_start;row--){
                System.out.print(spiral[row][col_start]+ " ");
            }
            col_start++;    

            System.out.println();

        }


    }
    
}
