import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanf
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        // bubblesort
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        // Sum
        double sum = calculateSum(array);
        System.out.println("Sum of array elements: " + sum);
        // AVG
        double average = calculateAverage(array);
        System.out.println("Average of array elements: " + average);
        scanner.close();
    }
    //bubble sort
    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    //sum
    public static double calculateSum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }
    //avg
    public static double calculateAverage(double[] array) {
        double sum = calculateSum(array);
        return sum / array.length;
    }
}
