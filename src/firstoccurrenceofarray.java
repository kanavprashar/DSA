public class firstoccurrenceofarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 7, 1};
        int x = 1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("The element is found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}
