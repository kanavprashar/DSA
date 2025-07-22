import java.util.Scanner;

public class TripletCheckSum {
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

        int count = 0;
        System.out.println("Enter target sun");
        int targetSum=sc.nextInt();

        System.out.println("Triplets that sum to " + targetSum + ":");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        count++;
                    }
                }
            }
        }

        System.out.println("Total triplets with sum " + targetSum + ": " + count);
    }
}
