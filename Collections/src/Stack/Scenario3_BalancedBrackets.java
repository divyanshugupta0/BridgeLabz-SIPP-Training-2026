package Stack;


import java.util.Stack;

public class Scenario3_BalancedBrackets {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') st.push(c);
            else {
                if (st.isEmpty()) return false;
                char x = st.pop();
                if ((c == ')' && x != '(') || (c == ']' && x != '[') || (c == '}' && x != '{')) return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}
