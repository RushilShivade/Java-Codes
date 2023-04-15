import java.util.*;
public class ArrayHWThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int firstArray[] = new int[size];

        for(int i=0; i<size; i++) {
            firstArray[i] = scanner.nextInt();
        }

        int flag=0;
        for(int i=0; i<size-1; i++) {
            if(firstArray[i] < firstArray[i+1]){
                flag=1;
            } else{
                flag=0;
            }

        }
        if(flag==1){
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is not sorted.");
        }
    }
}
