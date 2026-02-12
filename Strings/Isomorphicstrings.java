package Strings;

public class Isomorphicstrings{
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        Isomorphicstrings sol=new Isomorphicstrings();
        System.out.println("the result is"+sol.isomorphicStrings(s, t));
    }
    public boolean isomorphicStrings(String s,String t){
        int n=s.length();
        int[] m1=new int[256];
        int[] m2=new int[256];
        for(int i=0;i<n;i++){
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]){
                return false;
            }
            m1[s.charAt(i)]=i+1;
            m2[t.charAt(i)]=i+1;
        }
        return true;
    }
    
}
