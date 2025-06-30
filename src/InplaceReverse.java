/*INPLACE REVERSAL MEANS THAT THE SAME ARRAY US CGAHGED AND NO  NEW ARRAY IS CREATED*/
public class InplaceReverse {

    // Swap function
    static void SwapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse function (in-place)
    static void RevArr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            SwapArr(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 5};

        RevArr(arr); // Reverse the array

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
