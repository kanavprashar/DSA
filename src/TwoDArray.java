public class TwoDArray {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //accessing the element
        System.out.println("Element at 0 row column 1:"+matrix[0][1]);

        //update
        matrix[1][0]=20;
        System.out.println("Matrix updated value for[1][0]:"+matrix[1][0]);

        System.out.println("2D Array");
        for(int i=0;i< matrix.length;i++){//row
            for(int j=0;j<matrix[i].length;j++){//column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
