package java_dsa.Strings;
import java.util.Arrays;
public class Longestprefix {
    public static void main(String[] args) {
        Longestprefix sol=new Longestprefix();
        String[] input={"interval","interview","international"};
        System.out.println("the resukt is "+sol.longestPrefixString(input));
    }
    public String longestPrefixString(String[] v){
        StringBuilder result=new StringBuilder();
        Arrays.sort(v);
        String first=v[0];
        String last=v[v.length-1];
        for(int i=0;i<=Math.min(first.length(), last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return result.toString();
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
    
}
