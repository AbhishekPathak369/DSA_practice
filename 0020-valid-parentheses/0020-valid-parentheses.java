import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // Opening bracket
            if (curr == '(' || curr == '{' || curr == '[') {
                st.push(curr);
            }

            // Closing bracket
            else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((curr == ')' && top == '(') ||
                    (curr == ']' && top == '[') ||
                    (curr == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}