import java.util.*;

public class quadratic_eqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("For a quadratic equation: ax^2 + bx + c = 0 , specify the values of a, b and c: ");

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double x = ((b * b) - (4 * a * c));

        double r1 = ((((-b) + Math.sqrt(x))) / (2 * a));
        double r2 = ((((-b) - Math.sqrt(x))) / (2 * a));

        if (x >= 0) {
            System.out.println("The roots for the given equations are: " + r1 + " " + r2);
        } else {
            double real = ((-b) / (2 * a));
            double imaginary = (((Math.sqrt(-x))) / (2 * a));

            System.out.print("The roots for the given equations are: ");
            System.out.format("r1 = %.2f+%.2fi", real, imaginary);
            System.out.format(" r2 = %.2f-%.2fi", real, imaginary);
        }

    }
}
