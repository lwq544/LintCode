public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        boolean flag = true;
        if(s.length()%2==0) {
            Stack<Character> stack = new Stack();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (ch == ')') {
                        if (stack.pop() != '(') {
                            flag = false;
                            break;
                        }
                    } else if(ch =='}') {
                        if (stack.pop() != '{') {
                            flag = false;
                            break;
                        }
                    } else if(ch ==']') {
                        if (stack.pop() != '[') {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(!stack.isEmpty()) {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
}
