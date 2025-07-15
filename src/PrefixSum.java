import java.util.Scanner;

/*GIVEN AN ARRAY A GIVE THE PREFIX SUM AND RUNNING SUM WITHOUT CREATING NEW ARRAY*/
public class PrefixSum {

        static void printArr(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // In-place prefix sum
        static void prefixArr(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i];  // accumulate
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Original array:");
            printArr(arr);

            prefixArr(arr);  // do in-place prefix sum

            System.out.println("Prefix sum array:");
            printArr(arr);
        }
    }



