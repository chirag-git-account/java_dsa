package Strings;

public class Anagram {
    public static void main(String[] args) {
        Anagram ana=new Anagram();
        String s="anagram";
        String t="nagaram";
        System.out.println("the result is "+ana.anagramFind(s, t));
    }
    public boolean anagramFind(String s, String t){
        if(s.length()!=t.length())return false;
        int[] m=new int[26];
        for(int i=0;i<s.length();i++){
            m[s.charAt(i)-'a']++;
            m[t.charAt(i)-'a']--;
        }
        for(int ch:m){
            if(ch!=0){
                return false;
            }

        }
        return true;
    }
    
}
