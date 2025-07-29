
package string;
import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string 1");
        String str=sc.nextLine();
        System.out.println(str);

//        int sh=str.length();
//        System.out.println("the length of the string is "+sh);
//
//        char index=str.charAt(3);
//        System.out.println("the chacter at index 3 is "+index);
//
//        System.out.println("enter the charcter whose index you want:");
//        String c=sc.next();
//        System.out.println("the index of "+c+" is "+str.indexOf(c));
//
//        //COMPARE TO,RETURNS ZERO IF TWO STRINGS ARE EQ,POSITIVE IF FIRDST IS LEXOGRAPHICALLY GREATER AND - IF SMALLER
//        System.out.println("enter your string 1");
//        String str1=sc.nextLine();
//        System.out.println(str1);
//
//        int l=str.compareTo(str1);
//        System.out.println(l);

        System.out.println(str.contains("kana"));
        System.out.println(str.startsWith("Ka"));








    }

}
