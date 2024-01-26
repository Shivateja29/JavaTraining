import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input array size from user
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Input array elements from user
            int[] inputArray = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                inputArray[i] = scanner.nextInt();
            }

            // Display the original array
            System.out.print("Entered Array: ");
            displayArray(inputArray);

            // Calculate and display the sum and average
            int sum = calculateSum(inputArray);
            double average = calculateAverage(inputArray);

            System.out.println("Sum of Array: " + sum);
            System.out.println("Average of Array: " + average);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

    // Method to calculate the sum of array elements
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate the average of array elements
    private static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    // Method to display the elements of an array
    private static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
