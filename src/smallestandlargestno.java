import java.util.Scanner;
import java.util.Arrays;

public class smallestandlargestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Smallest and largest values
        int smallest = arr[0];
        int largest = arr[arr.length - 1];

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
