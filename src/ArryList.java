import java.util.ArrayList;
public class ArryList {
    public static void main(String[] args) {
        //create array list(dynamic array)
        ArrayList<Integer> numbers= new ArrayList<Integer>();

        //adding elements in array list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //accessing the element in array list
        System.out.println("Element at index 0:"+numbers.get(0));
        System.out.println("Element at index 0:"+numbers.get(1));
        System.out.println("Element at index 0:"+numbers.get(2));

        //updating, arrayname.set(index,value)
        numbers.set(0,11);
        System.out.println("The updated value of index 0 is:"+numbers.get(0));

        //deletion
        numbers.remove(2);

        //size of array
        int size=numbers.size();
        System.out.println("The size of the array is:"+size);

        //loop through the array list
        for(int i=0;i<numbers.size();i++){
            System.out.println("Element at index " +i+" is: "+numbers.get(i));
        }

        //adding a number at a index add(index,interger value)
        numbers.add(2,30);

        System.out.println("The new array is:");
        for(int i=0;i<numbers.size();i++){
            System.out.println("Element at index " +i+" is: "+numbers.get(i));
        }



    }
}
