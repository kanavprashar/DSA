/*FIND THE MAX AND SECND MAX IN THE ARRAY*/
public class MaxNoInArray {
    public static void main(String[] args) {
        int arr[] = {0, 1, 3, 576, 24, 245, 566, 32};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max number is: " + max);

        // Replace first max with Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
                break; // Only remove one occurrence (if needed)
            }
        }

        // Now find second max
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("The second max number is: " + secondMax);
    }
}
