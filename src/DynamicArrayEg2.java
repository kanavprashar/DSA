import java.sql.SQLOutput;
import java.util.ArrayList;
public class DynamicArrayEg2 {
    public static void main(String[] args) {
        ArrayList<String> fruits =new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("PineApple");
        fruits.add("Melon");

        //print the arraylist
        System.out.println("The fruits are:"+fruits);

        String fruit= fruits.get(1);
        System.out.println("Element at index 1 is: "+fruits.get(1));

        //check if it contains  Muskmelom
        boolean containsMuskmelon= fruits.contains("Muskmelon");
        System.out.println("Mango is present: "+containsMuskmelon);

        //remove the element
        String RemoveFruit=fruits.remove(0);
        System.out.println("The Fruits are:"+fruits);

        //chevk if empty
        boolean Empty=fruits.isEmpty();
        System.out.println("Array list is empty:"+Empty);

        //cehcking the size of the arraylist
        int size=fruits.size();
        System.out.println("The size of the arraylist is:"+size);

        //clear the array list
        fruits.clear();
        System.out.println("The arraylist is:");

        //chevk if empty
        Empty=fruits.isEmpty();
        System.out.println("Array list is empty:"+Empty);





    }
}
