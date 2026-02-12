package java_dsa.Strings;

public class Reversestrings {
    public static void main(String[] args) {
        String s="Hello World";
        Reversestrings sol=new Reversestrings();
        System.out.println("the result is "+sol.reverseString(s));

    }
    public String reverseString(String s){
        StringBuilder result=new StringBuilder();
        int i=s.length()-1;
        while (i>=0) {
            while (i>=0 && s.charAt(i)==' ' ) {
                i--;
            }
            if(i<0)break;
            int end=i;
            while(i>=0 && s.charAt(i)!=' ' ){
                i--;
            }
            String word=s.substring(i+1,end+1);
            if(result.length()>0){
                result.append(' ');
            }
            result.append(word);            
        }
        return result.toString();

    }
    
}
