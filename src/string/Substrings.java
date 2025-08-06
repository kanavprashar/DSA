package string;
import java.util.*;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        String str="xyx";
//        str+=10;
//        str+='u';
//        str+="abc";
//        System.out.println(str);

//        String str="kanav prashar";
//        String str1=str.substring(0,4);
//        System.out.println(str1);
//
//        String str2=str.substring(1);
//        System.out.println(str2);



        //GIVEN A STRING S.GIVE ALL THE SUBSTRINGS OF S.S="ABCD"
        String s="abcd";
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }


    }

}
