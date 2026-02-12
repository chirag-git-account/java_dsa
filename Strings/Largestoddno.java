package java_dsa.Strings;
import java.util.*;

public class Largestoddno {
    public static void main(String[] args) {
        String s="58743";
        Largestoddno sol =new Largestoddno();
        System.out.println("the result is"+sol.largestOddNo(s));

    }
    public String largestOddNo(String s){
        int ind=-1;
        int i;
        for(i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                ind=i;
                break;
            }
            
        }
        if(ind==-1){
                return "";

            }
            
        i=0;
        while(i<=ind && s.charAt(i)=='0')i++;
        return s.substring(i,ind+1);
    }
    
}
