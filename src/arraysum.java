public class arraysum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 3, 2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);  // Print only the final sum
    }
}
