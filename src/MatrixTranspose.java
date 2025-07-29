import java.util.Scanner;

public class MatrixTranspose {
    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r]; // Transposed matrix dimensions: c x r
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j]; // Fixed: was ans[i][j] = matrix[j][i]
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        System.out.println("Enter the rows in matrix:");
        int r = sd.nextInt();
        System.out.println("Enter the no of columns:");
        int c = sd.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sd.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        print(matrix);

        int[][] transposed = transpose(matrix, r, c);

        System.out.println("Transposed Matrix:");
        print(transposed);

        sd.close();
    }
}
