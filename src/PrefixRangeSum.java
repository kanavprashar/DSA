/*GIVEN AN ARRAY A OF INTERGS SIZE NANSWER Q QUERIRES WHERE YOU NEED TO PRINT THE SUM OF VALUE SIN THE RANGE OF L TO R(BOTH INCLUDEXD) THE VALUES OF L AND R FOLLOW 1 BASED INDEXING*/
import java.util.Scanner;

public class PrefixRangeSum {

    // Method to convert arr[] to prefix sum array
    static int[] makePrefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];  // 1-based indexing
        System.out.println("Enter the elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pref = makePrefixSum(arr);

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range (l r):");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l - 1];
            System.out.println("Sum in range [" + l + ", " + r + "] is: " + ans);
        }
    }
}
