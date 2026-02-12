package java_dsa.Strings;
import java.util.*;

class Removeouterpara {

    public static void main(String[] args) {
        Removeouterpara obj = new Removeouterpara();
        String ans = obj.removeOuterParentheses("(()())(())");
        System.out.println("The result is " + ans);
    }

    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0) result.append(ch);
                level++;
            } else if (ch == ')') {
                level--;
                if (level > 0) result.append(ch);
            }
        }
        return result.toString();
    }
}


