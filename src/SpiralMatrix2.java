/*GIVEN A POSITIVE INTEGER N, GENERATE A N*N MATRIX FILLED WITH ELEMENTS FROM 1 TO N^2 IN A SPIRAL*/
import java.util.Scanner;

public class SpiralMatrix2 {
    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t"); // Using tab for better alignment
            }
            System.out.println();
        }
    }

    static int[][] spiral(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;

        while (current <= n * n) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                matrix[topRow][j] = current++; // Fixed: assign instead of print
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                matrix[i][rightCol] = current++; // Fixed: condition to <=
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                matrix[bottomRow][j] = current++; // Fixed: condition to <=
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                matrix[i][leftCol] = current++; // Fixed: removed double increment
            }
            leftCol++;
        }

        return matrix; // Added: return the matrix
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int[][] result = spiral(n); // Added: call the method
        System.out.println("Generated " + n + "x" + n + " Spiral Matrix:");
        print(result); // Added: print the result

        sc.close();
    }
}
