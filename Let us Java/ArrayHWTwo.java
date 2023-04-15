import java.util.*;
public class ArrayHWTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int Array[] = new int[size];
        for(int i=0; i<Array.length; i++) {
            Array[i] = scanner.nextInt();
        }

        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for(int i=0; i<size; i++) {
            if(Array[i] < min){
                min = Array[i];
            }
        }

        for(int i=0; i<size; i++) {
            if(Array[i] > max){
                max = Array[i];
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
    
}
