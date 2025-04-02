import java.util.Scanner;

public class userinputarray {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

        System.out.println("Enter the values");

        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}

