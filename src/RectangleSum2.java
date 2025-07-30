import java.util.Scanner;

//using prefix sum.
public class RectangleSum2 {
    static void findPrefixSum(int[][]matrix){
        int r = matrix.length;
        int c = matrix[0].length; //can only be used where r>0
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){ // j is started from 1 so j-1 doesn't give negative
                matrix[i][j] += matrix[i][j-1]; //calculate the prefix sum in 2D, the row remains same but the column value changes
            }
        }
    }

    static int findSum2(int[][]matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSum(matrix);
        for(int i = l1; i <= l2; i++){
            //sum of r1 to r2 for each row from l1 to l2
            if(r1 > 0)
                sum += matrix[i][r2] - matrix[i][r1-1];
            else
                sum += matrix[i][r2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelements = r * c;

        System.out.println("Enter " + totalelements + " elements:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries (l1, r1, l2, r2):");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum: " + findSum2(matrix, l1, r1, l2, r2));
        sc.close();
    }
}
