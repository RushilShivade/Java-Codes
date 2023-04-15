import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int rows= Scanner.nextInt();
        int cols= Scanner.nextInt();

        //Defining 2D array
        int TwoDArray[][] = new int[rows][cols];

        for(int i=0; i<rows;i++){

            for(int j=0;j<cols;j++){
                TwoDArray[i][j] = Scanner.nextInt();
            }
        }

        System.out.print("Enter the element you want to find: ");
        int x = Scanner.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(TwoDArray[i][j] == x){
                    System.out.print("The entered element is at the position: "+ i+","+j);
                }
                
            }
        }
    }
    
}
