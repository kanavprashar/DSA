public class ArrayUpdate {
    public static void main(String[] args) {
        System.out.println("BEFORE UPDATE");
        int numbers[]=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("AFTER UPDATE");
        numbers[2]=25;
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        int x=numbers.length;
        System.out.println("THE LENGTH OF THE ARRAY IS:"+x);



    }
}
