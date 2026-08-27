class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i =0;
        if(n==1) return false;
        while(i <n){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                st.push(curr);
            }else{

                if(st.size() == 0){ return false;}
                if(curr == ')' && st.peek()== '(' || curr == ']' && st.peek() == '[' || curr== '}' && st.peek() == '{'){
                    st.pop();
                }
                 else {
                     return false;
                 }
                }
            
            i++;
        }
        if(st.size() ==0) return true;
        return false;
    }
}