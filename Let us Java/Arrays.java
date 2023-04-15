import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int firstArray[] = new int[size];

        for(int i=0; i<firstArray.length; i++) {
            firstArray[i] = scanner.nextInt();
        }

        for(int i=0;i<firstArray.length; i++) {
            System.out.print(firstArray[i]+" ");
        }

        // find an element in the array.

        System.out.print("Enter the element you want to find in the array: ");
        int x= scanner.nextInt();

        for(int i=0;i<firstArray.length;i++)
        {
            if(x == firstArray[i])
            {
                System.out.println("The given element is at the index: " + i);
            }
        }
    }
    
}
