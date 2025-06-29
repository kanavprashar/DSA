import javax.sound.midi.Soundbank;
/*ROTATE THE ARRAY BY K ROTATIONS*/
import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int m=sc.nextInt();
        System.out.println("enter the elemets");
        int [] arr= new int[m];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER TGE rotation");
        int k=sc.nextInt();
        int j=0;


        int n=arr.length;
        k=k%n;

        int [] ans=new int[m];
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        System.out.println("org arr");


        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println("rev array");
        for(int i=0;i<n;i++) {
            System.out.print(ans[i] + " ");
        }



    }
}
