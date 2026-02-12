package java_dsa.Strings;

import java.util.HashMap;

public class Romantoint {
    public static void main(String[] args) {
        Romantoint sol=new Romantoint();
        String s="LVIII";
        System.out.println("the result is"+sol.romanToString(s));


    }
    public int romanToString(String s){
        int res=0;
        HashMap<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for(int i=0;i<s.length()-1;i++){
            if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
                res-=roman.get(s.charAt(i));
            }
            else{
                res+=roman.get(s.charAt(i));
            }
        }
        return res+roman.get(s.charAt(s.length()-1));

    }
}
