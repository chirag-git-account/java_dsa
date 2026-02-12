package java_dsa.Strings;

import java.util.HashMap;
import java.util.HashSet;

public class Smallestdistinctwindow {
    public static void main(String[] args) {
        Smallestdistinctwindow sol=new Smallestdistinctwindow();
        String str="aabcbcdbca";
        System.out.println("the result is "+sol.findSubString(str));
    }
    public int findSubString(String str) {
        // code here
        int n= str.length();
        HashSet<Character> set=new HashSet<>();
        for( char ch:str.toCharArray()){
            set.add(ch);
        }
        int required=set.size();
        int min=n;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0,right = 0;
        int formed=0;
        while (right < str.length()) {
            map.put(str.charAt(right),  map.getOrDefault(str.charAt(right), 0) + 1);
            if(map.get(str.charAt(right))==1){
                formed++;
            }

            while(formed==required) {
                min=Math.min(min,right-left+1);
                map.put(str.charAt(left), map.get(str.charAt(left)) - 1);
                if(map.get(str.charAt(left))==0){
                    formed--;
                }
                left++;
            }
            

            right++;
        }
        return min;
    }
    
    
}
