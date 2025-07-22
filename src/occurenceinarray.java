import java.util.Scanner;

public class occurenceinarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter elements of array");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number whose occurence you want to find:");
        int x= sc.nextInt();

        int count=0;
        for(int i=0;i< arr.length;i++){
            if(x==arr[i]){
                count=count+1;
            }

        }
        System.out.println("the no" +x +" occurs " +count + " times");
    }
}
