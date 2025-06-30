import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        // Validate k
        if (k > n || k <= 0) {
            System.out.println("Invalid value of k. It should be between 1 and " + n);
            return;
        }

        // Sort the array
        Arrays.sort(arr);

        // kth smallest and largest
        int kthSmallest = arr[k - 1];
        int kthLargest = arr[n - k];

        System.out.println(k + "th smallest number: " + kthSmallest);
        System.out.println(k + "th largest number: " + kthLargest);
    }
}
