import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MatrixMultiplication {
    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][]a,int r1,int c1,int [][]b,int r2,int c2){
        if(c1!=r2){
            System.out.println("the input is invalid");
            return;
        }
        int [][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){//rows
            for(int j=0;j<c2;j++){//columns
                for(int k=0;k<c1;k++){//multiply
                    mul[i][j]+=a[i][k]*b[k][j];

                }

            }
        }
        System.out.println("multiplication of 2 matrixes");
        print(mul);
    }

    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        System.out.println("Enter the rows in matrix A:");
        int r1 = sd.nextInt();
        System.out.println("Enter the columns in matrix A:");
        int c1 = sd.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sd.nextInt();
            }
        }

        System.out.println("Enter the rows in matrix B:");
        int r2 = sd.nextInt();
        System.out.println("Enter the columns in matrix B:");
        int c2 = sd.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r2; i++) {  // Fixed: was r1, should be r2
            for (int j = 0; j < c2; j++) {
                b[i][j] = sd.nextInt();
            }
        }

        System.out.println("Matrix A:");
        print(a);
        System.out.println("Matrix B:");
        print(b);
        multiply(a,r1,c1,b,r2,c2);
    }


}
