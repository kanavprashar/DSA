import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] numbers = new int[size + 1]; // Increase size by 1 to accommodate new insertion
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the index where you want to insert:");
        int insertIndex = sc.nextInt();

        // Validate index
        if (insertIndex < 0 || insertIndex > size) {
            System.out.println("Invalid index! Index should be between 0 and " + size);
            return;
        }

        System.out.println("Enter the new value:");
        int insertValue = sc.nextInt();

        // Shift elements to the right
        for (int i = size; i > insertIndex; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[insertIndex] = insertValue;
        size++; // Update size after insertion

        System.out.println("The modified array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        sc.close(); // Close scanner to prevent resource leak
    }
}
