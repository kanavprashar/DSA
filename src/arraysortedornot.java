import java.util.Scanner;

public class arraysortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Check if array is sorted
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted: " + isSorted);

    }
}
