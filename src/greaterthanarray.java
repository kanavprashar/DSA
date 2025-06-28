/*find the number greter than x in array*/
import java.util.Scanner;

public class greaterthanarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter elements of array");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number who you want to find greater numbers in array:");
        int x= sc.nextInt();

        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>x){
                count++;
            }

        }
        System.out.println("the total nos greater than " +x +" are  " +count);
    }
}
