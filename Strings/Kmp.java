package java_dsa.Strings;

public class Kmp {
    public static void main(String[] args) {
        Kmp sol=new Kmp();
        String s="aaaa";
        System.out.println("the result is"+sol.getLPSLength(s));
    }
    int getLPSLength(String s) {
        int n = s.length();
        int[] lps = new int[n];
        
        int pre = 0;   // length of previous longest prefix suffix
        int suf = 1;   // current index
        
        while (suf < n) {
            if (s.charAt(suf) == s.charAt(pre)) {
                lps[suf] = pre+1;
                suf++;
                pre++;
            } else {
                if (pre == 0) {
                    lps[suf] = 0;
                    suf++;
                } else {
                    pre = lps[pre - 1];
                }
            }
        }
        
        return lps[n - 1];
    }
    
}
