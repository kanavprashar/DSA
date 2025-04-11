import java.util.ArrayList;
public class HeterogenousArrayList {
    public static void main(String[] args) {
        ArrayList<Object> data=new ArrayList<>();
        data.add("HelLlo");
        data.add(99);
        data.add("true");
        data.add("0.0983");
        data.add("A");

        //ACCESSING
        for (int i=0;i< data.size();i++){
            Object element=data.get(i);
            System.out.println(element);
        }


    }
}
