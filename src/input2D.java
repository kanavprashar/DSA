import java.util.Scanner;

public class input2D {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r= sc.nextInt();
        System.out.println("Enter teh no of columns");
        int c=sc.nextInt();

        System.out.println("enter " +r*c+" elements");

        int [][] arr= new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();

            }        }
        System.out.println("the matrix is:");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
