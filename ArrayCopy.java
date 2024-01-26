public class ArrayCopy {

    public static void main(String[] args) {
        // Declare an array with 8 elements
        int[] originalArray = {4, 8, 15, 16, 23, 42, 56, 72};

        // Create a new array with the same length as the original array
        int[] copiedArray = new int[originalArray.length];

        // Copy elements from the original array to the new array
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // Display the original array
        System.out.print("Original Array: ");
        displayArray(originalArray);

        // Display the copied array
        System.out.print("Copied Array:   ");
        displayArray(copiedArray);
    }

    // Helper method to display the elements of an array
    private static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
