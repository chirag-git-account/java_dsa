package java_dsa.Strings;

public class Rotatestrings {
    public static void main(String[] args) {
        Rotatestrings sol=new Rotatestrings();
        String s="abcde";
        String t="cdeab";
        System.out.println("the result is"+sol.rotateStrings(s, t));
    }
    public int rotateStrings(String s,String t){
        String Double=s+s;
        int index=Double.indexOf(t);
        if (index == -1) {
            return -1;   // 
        }

        return index; 
        
    }
    
}
