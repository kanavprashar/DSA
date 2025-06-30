/*CREATE AN ARRAY TO SEARCH DIFF NOS IF PRESENT IN ARRAY*/
import java.util.Scanner;

public class FrequencyArray {

    static int[] FreqArr(int[] arr) {
        int[] freq = new int[100005]; // assuming all numbers are < 100005
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int m = sc.nextInt();

        int[] arr = new int[m];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ✅ Correct way to call the static method
        int[] freq = FreqArr(arr);

        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the number to search:");
            int x = sc.nextInt();
            if (x >= 0 && x < freq.length && freq[x] > 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            q--;
        }
    }
}
