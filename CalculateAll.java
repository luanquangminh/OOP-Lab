import java.util.Scanner;

public class CalculateAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        }
        else  {
            quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);

        } 
        scanner.close();

    }
        
}
