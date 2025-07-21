/*check if we can spilt an array into 2 subarrays with eq sum.more formallu=y check if prefix sum is eq tosuffix sum*/
import java.util.Scanner;

public class SuffixPrefix {

    static int findSum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findSum(arr);
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;  // partition point found
            }
        }

        return false;  // no partition point
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];  // 0-based indexing
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean canPartition = equalSumPartition(arr);
        System.out.println("Equal partition possible: " + canPartition);
    }
}
