import java.util.*;

public class subsequence {

    public static void f(int[] arr, int idx, ArrayList<Integer> res, int sum, int s) {
        if (idx == arr.length) {
            // int x = 0;
            // System.out.println(res);
            // for (int i = 0; i < res.size(); i++) {
            // x += res.get(i);
            // }
            // System.out.print(x + " ");
            // System.out.println(sum);
            if (s == sum) {
                System.out.print(res + " ");
            }
            return;
        }
        f(arr, idx + 1, res, sum, s);
        res.add(arr[idx]);
        s += arr[idx];
        f(arr, idx + 1, res, sum, s);
        res.remove(res.size() - 1);
        s -= arr[idx]; // Backtracking

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 2;
        int sum = 3;
        ArrayList<Integer> res = new ArrayList<>();

        f(arr, 0, res, 3, 0);
    }

}
