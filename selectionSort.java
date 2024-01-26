import java.util.Scanner;

public class selectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input array size from user
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] inputArray = new int[size];

            // Input array elements from user
            System.out.print("Enter the array elements: ");
            for (int i = 0; i < size; i++) {
                inputArray[i] = scanner.nextInt();
            }

            // Display original array
            System.out.print("Original Array: ");
            for (int value : inputArray) {
                System.out.print(value + " ");
            }
            System.out.println();

            // Sorting the array using selection sort
            selectionSort(inputArray);

            // Display sorted array
            System.out.print("Sorted Array: ");
            for (int value : inputArray) {
                System.out.print(value + " ");
            }
            System.out.println();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}