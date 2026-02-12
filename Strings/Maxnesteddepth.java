package java_dsa.Strings;
import java.util.*;

public class Maxnesteddepth {
    public static void main(String[] args) {
        Maxnesteddepth sol=new Maxnesteddepth();
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println("the result is "+sol.maxNested(s));
    }    
    public int maxNested(String s){
        int p=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if( ch== '(')p++;
            else if(ch==')')p--;
            ans=Math.max(ans, p);
        }
        return ans;

    }
}
