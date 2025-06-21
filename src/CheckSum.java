import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int targetsum=4;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==targetsum){
                    sum++;
                }



                };


            }
        System.out.println("there exist  " +sum+ " nos");
        }


    }

