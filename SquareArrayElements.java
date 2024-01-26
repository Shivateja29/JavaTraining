import java.util.Scanner;

public class SquareArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the array from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array
        int[][] array = new int[rows][columns];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Display the original array
        System.out.println("\nOriginal Array:");
        displayArray(array);

        // Display the square of each element
        System.out.println("\nSquare of Each Element:");
        displaySquareArray(array);

        scanner.close();
    }

    // Method to display the elements of the array
    private static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to display the square of each element in the array
    private static void displaySquareArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] * array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
