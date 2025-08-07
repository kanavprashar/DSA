//reverse the words of the sentence hi i am kanav prashar
package string;
import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        String str="Hi i am kanav prashar";
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb.delete(0,sb.length());
            }
        }
        //if we write code till here only we do not recieve the last word as the last word does not have space in front of it so it is left in sb
        sb.reverse();
        ans+=sb;
        System.out.println("the reversed string is:"+ans);


    }

}
