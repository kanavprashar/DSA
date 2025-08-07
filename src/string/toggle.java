//TOGGLE THE CHARCTER OF THER STRING,COVERT UPPER CASE TO LOWER AND VICA VERSA.
package string;

import java.util.*;
import java.lang.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println("you entered "+str);
        for(int i=0;i<str.length();i++){
            boolean flag=true;//for capital flag is true
            char ch=str.charAt(i);
            if(ch==' ') continue;
            int asci=(int)ch;
            if(asci>=97) flag=false;//small letter
            if(flag==true){//capital
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else {
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);


            }
        }
        System.out.println("the toggled is: "+str);




    }
}
