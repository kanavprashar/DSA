import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] numbers = new int[size]; // No need for size + 1
        System.out.println("Enter the values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " "); // Print on the same line
        }
        System.out.println(); // New line for better formatting

        System.out.println("Enter the index value to be deleted:");
        int delindex = sc.nextInt();

        // Validate index
        if (delindex < 0 || delindex >= size) {
            System.out.println("Invalid index! No deletion performed.");
        } else {
            // Shift elements left
            for (int i = delindex; i < size - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            size--; // Reduce size since an element is removed

            System.out.println("The new array is:");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println(); // New line for better output formatting
        }

        sc.close(); // Close scanner to prevent resource leak
    }
}
