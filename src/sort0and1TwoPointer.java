import java.util.Scanner;

public class sort0and1TwoPointer {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort0and1(int[]arr) {
        int n = arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;

            }
            if(arr[left]==0){
                left++;

            }
            if(arr[right]==1){
                right--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("enter the elements");{
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
        }
        System.out.println("org array");
        printArr(arr);
        sort0and1(arr);
        System.out.println("new array");
        printArr(arr);

    }

}
