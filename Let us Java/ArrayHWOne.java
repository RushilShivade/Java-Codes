import java.util.*;

public class ArrayHWOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        String array[] = new String[size];

        for(int i=0; i<size;i++){
            array[i] = scanner.next();
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }

    }
    
}
