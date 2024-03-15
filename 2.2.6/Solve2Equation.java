import java.util.Scanner;

public class Solve2Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a b c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        //ax^2+bx+c=0
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Infinite Solutions!");
                }
                else{
                    System.out.println("No Solution!");
                }
            }
            else{
                double solution = -c / b;
                System.out.println("1 Solution: " + solution);
            }
        }
        else{
            double delta = b * b - 4 * a * c;
            
            if(delta < 0){
                System.out.println("No Real Solutions!");
            }
            else if(delta == 0){
                double solution = -b / (2 * a);
                System.out.println("1 Real Solution: " + solution);
            }
            else{
                double solution1 = (-b + Math.sqrt(delta)) / (2 * a);
                double solution2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("2 Real Solutions: " + solution1 + ", " + solution2);
            }
        }
        scanner.close();
    }
}
