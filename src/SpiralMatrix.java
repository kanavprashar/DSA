import java.util.Scanner;

public class SpiralMatrix {
    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // Fixed: println to print
            }
            System.out.println(); // New line after each row
        }
    }

    static void spiral(int[][] matrix, int r, int c) { // Fixed: method name to camelCase
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalNos = 0;

        while (totalNos < r * c) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalNos < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalNos++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalNos < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalNos++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalNos < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalNos++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalNos < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " "); // Fixed: println to print
                totalNos++;
            }
            leftCol++;
        }
        System.out.println(); // New line after spiral traversal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("INPUT MATRIX:");
        print(matrix);

        System.out.println("SPIRAL TRAVERSAL:"); // Fixed: meaningful label
        spiral(matrix, r, c); // Added: method call

        sc.close();
    }
}
