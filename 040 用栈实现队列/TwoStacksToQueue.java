import java.util.Stack;

/**
 * Created by Silocean on 2016-03-30.
 */
public class TwoStacksToQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public TwoStacksToQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int element) {
        stack1.push(element);
    }

    public int pop() {
        if (stack2.empty()) { // stack2如果是空的，把stack1的元素全部压入stack2，再从stack2中弹出栈顶元素
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int top() {
        if (stack2.empty()) { // stack2如果是空的，把stack1的元素全部压入stack2，再从stack2中弹出栈顶元素
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}
