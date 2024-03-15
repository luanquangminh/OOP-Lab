import java.util.Scanner;

public class MatrxAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanf size
        System.out.print("Input rows size: ");
        int rows = scanner.nextInt();
        System.out.print("Input columns size: ");
        int cols = scanner.nextInt();
        // scanf 1st matrix
        double[][] matrix1 = new double[rows][cols];
        System.out.println("Enter first matrix:");
        inputMatrix(scanner, matrix1);
        // scanf 2nd matrix
        double[][] matrix2 = new double[rows][cols];
        System.out.println("Enter second matrix:");
        inputMatrix(scanner, matrix2);
        // add
        double[][] result = addMatrices(matrix1, matrix2);
        System.out.println("Result:");
        displayMatrix(result);
        scanner.close();
    }
    // scanf matrix
    public static void inputMatrix(Scanner scanner, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }
    // add
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
    // printf
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
