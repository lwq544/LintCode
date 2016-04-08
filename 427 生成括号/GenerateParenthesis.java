import java.util.ArrayList;

/**
 * Created by Silocean on 2016-04-03.
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        ArrayList<String> list = generateParenthesis(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }
        helper(result, "", n, n);
        return result;
    }

    public static void helper(ArrayList<String> result, String paren, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(paren);
            return;
        }

        if (left > 0) {
            helper(result, paren + "(", left - 1, right);
        }

        if (right > 0 && left < right) {
            helper(result, paren + ")", left, right - 1);
        }
    }
}
