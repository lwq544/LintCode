public class Solution {
    /**
     * @param tokens The Reverse Polish Notation
     * @return the value
     */
    public int evalRPN(String[] tokens) {
        // Write your code here
        Stack stack = new Stack();
        for (String token : tokens) {
            if(token.equals("+")) {
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                int temp = b + a;
                stack.push(temp+"");
            } else if(token.equals("-")) {
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                int temp = b - a;
                stack.push(temp+"");
            } else if(token.equals("*")) {
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                int temp = b * a;
                stack.push(temp+"");
            } else if(token.equals("/")) {
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                int temp = b / a;
                stack.push(temp+"");
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop().toString());
    }
}
