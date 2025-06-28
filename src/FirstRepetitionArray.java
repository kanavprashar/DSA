/*FIND THE SECOND MAX ELEMENT IN THE ARRAY*/
public class FirstRepetitionArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 2, 4, 5, 6};
        int result = firstRep(arr);
        if (result != -1)
            System.out.println("First repeating element is: " + result);
        else
            System.out.println("No repeating element found.");
    }

    static int firstRep(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) { // start from i+1 to avoid self-comparison
                if (arr[i] == arr[j]) {
                    return arr[i]; // return as soon as first repetition is found
                }
            }
        }
        return -1; // if no repetition found
    }
}
/*HERE WE HABE NOT USED THE BREAK STATEMENT BECAUSE WE HASBE USED THE RETURN STATEMENT WJICH AUROMARICALLY TERMINAYED THE METHOD*/
