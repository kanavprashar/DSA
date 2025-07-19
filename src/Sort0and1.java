import java.util.Scanner;

/*SORT AN ARRAY CONTAING ONLY 0 AND 1s*/
public class Sort0and1 {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sort0and1(int[]arr){
        int n= arr.length;
        int zeros=0;
        //count the no of zeros
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        //for index 0 to zeros-1 and zeros to n-1=1
        for (int i=0;i<n;i++){
            if (i < zeros) {
                arr[i]=0;
            }else{
                arr[i]=1;
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
