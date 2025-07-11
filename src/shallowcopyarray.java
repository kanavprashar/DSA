public class shallowcopyarray {
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
        int [] arr1= arr;
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
/*WE SEE THAT THE CHANGES MADE IN THE COPIED ARRAY OS ALSO REFLECTED IN THE ORIGINAL ARRAY THIS IS BECAUSE THE WHEN WE CREATED ARR THE REFRENCE VARIABLE ARR IS CREATED ON THE STACK BUT THE MEMORY IS ALLOCATED ON THE HEAP SAY THE MEMORY LOCATION IS 101,NOW WE CREATED ARR1 WHICH CREATED A NEW REFRENCE VARIABLE ON THE STACK  AND HAS ASSIGNED VALUES OF ARR IN IT BUT THE MEMORY LOCATION FOR REFENCE VAR IS SAME SO THE CHANGES MADE IN THE COPIED ARRAY ARE ALSO REFLECTED IN ARR AS THE REFERENCE LOCATION IS SAME.*/