import java.util.Scanner;

/*
 * GIVEN A NUMBER N, RETURN FIRST N ROWS OF THE PASCAL TRIANGLE.
 * A PASCAL TRIANGLE IS A TRIANGLE IN WHICH EACH NUMBER IS THE SUM OF THE TWO NUMBERS DIRECTLY ABOVE IT.
 * IF ONE ROW HAS I COLUMNS THE NEXT WILL HAVE I+1 COLUMNS.
 * THE FIRST AND THE LAST ELEMENT OF EACH ROW IS 1.
 */
public class PascalsTree {
    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // Add spacing for better triangle appearance
            for (int space = 0; space < matrix.length - i - 1; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        // ith row has i+1 columns
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];

            // First and last number in a row is 1
            ans[i][0] = ans[i][i] = 1;

            // Fill middle elements
            for (int j = 1; j < i; j++) { // Fixed: j < n to j < i
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[][] ans = pascal(n); // Fixed: an to ans
        System.out.println("Pascal's Triangle:");
        print(ans); // Fixed: ans parameter name

        sc.close();
    }
}
