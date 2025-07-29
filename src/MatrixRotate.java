import java.util.Scanner;

/*  A MATRIX ROTATED IS JUST THE SAME AS THE TRANSPOSE OF THE MATRIX BUT IN REVERSED ORDER IE THE FIRST ROW WILL BECOME LLAST AND LAST WILL BECOME FIRST*/
public class MatrixRotate {
    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void matrixInplace(int[][] matrix, int r, int c) {
        // Perform in-place transpose by swapping elements
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) { // Start from i+1 to avoid swapping twice
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void reverse(int[]arr){
        int i=0,j= arr.length-1;
        while(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][]matrix,int n){
        //steps
        //transpose
        //reverse the rows in transposed matrix
        matrixInplace(matrix,n,n);
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }

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

        rotate(matrix,r);

        System.out.println("rotation of matrix");
        print(matrix);

        sd.close();
    }

}
