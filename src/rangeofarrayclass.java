import java.util.Arrays;

public class rangeofarrayclass {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    };
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5};
        System.out.println("the original array is:");
        printArray(arr);

        /*creating a copy of the array*/
        int [] arr1= Arrays.copyOfRange(arr,1,4);
        System.out.println("the copied array is:");
        printArray(arr1);

        /*now if we make changes ion the copied array*/

        arr1[1]=99;
        arr1[2]=100;

        System.out.println("the modified copy array is:");
        printArray(arr1);

        System.out.println("the original arrau is:");
        printArray(arr);


    }
}
/*THE COPY OF RANGE HAS 2 PARAMETERS ARR NAME AND FROM,TO.THE FROM IS INCLUSIVE BUT TO IS EXCLUSIVE THAT MEANS THAT THE VALUE AT FROM INDX IS COPIED BUT THE VALUE AT THE TO INDEX IS NOT COPIED */