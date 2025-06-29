import java.util.Scanner;

public class InplaceRotation {

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse function
    static void Reverse(int[] arr, int st, int en) {
        while (st < en) {
            swap(arr, st, en);
            st++;
            en--;
        }
    }

    // Rotate function (right rotation by k)
    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle k > n

        Reverse(arr, 0, n - 1);
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
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

        System.out.println("Enter the number of rotations:");
        int k = sc.nextInt();

        rotateInPlace(arr, k);

        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
