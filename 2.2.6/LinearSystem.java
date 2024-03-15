import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first equation (a11 a12 b1):");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        System.out.println("Enter the second equation (a21 a22 b2):");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double determinant = a11 * a22 - a21 * a12;
        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("The solution is: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        scanner.close();
    }
}
