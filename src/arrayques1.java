import java.util.Scanner;

public class arrayques1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        //input
        System.out.println("Enter the values:");
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Enter your number");

        int x=sc.nextInt();

        for(int i=0;i<numbers.length;i++) {
            if (x == numbers[i]) {
                System.out.println("The number is found at index:"+i);
            }
            else{
                System.out.println("The number is not found");
            }

        }
    }
}
