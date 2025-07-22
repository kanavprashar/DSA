public class HeterogenousArray {
    public static void main(String[] args) {
        //we can store heterogenous elements in array by creating object
        Object[] data=new Object[5];
        data[0]="Hello";
        data[1]="H122";
        data[2]="true";
        data[3]=3.30;
        data[4]="A";

        //accessing
        for(int i=0;i< data.length;i++){
            System.out.println(data[i]);
        }
    }
}
