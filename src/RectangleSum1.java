import java.util.Scanner;

/*GIVEN A MATRIX 'A' OF RxC AND 2 COORDINATES(l1,r1)&(l2,r2).return the sum of the rectangle from these.
CONDITIONS:
l2>=l1,r2>=r1
0<=l1,l2<r
0<=r1,r2<c
*/
public class RectangleSum1 {
    static int findSum(int[][]matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        // Fixed: should be <= to include the boundary coordinates
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns:");
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
        int r1 = sc.nextInt();  // Fixed: r1 should come after l1
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum: " + findSum(matrix, l1, r1, l2, r2));
        sc.close();
    }
}
