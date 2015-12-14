import java.util.ArrayList;

/**
 * Created by Silocean on 2015-12-14.
 * <p>
 * Write an algorithm to determine if a number is happy.
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
 * (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 * 样例
 * 19 is a happy number
 * <p>
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static Boolean flag = false;

    public static void main(String[] args) {
        System.out.print(isHappy(21));
    }

    public static boolean isHappy(int n) {
        if (n == 1) {
            flag = true;
        } else if (list.contains(n)) {
            flag = false;
        } else {
            list.add(n);
            String str = String.valueOf(n);
            int temp = 0;
            for (int i = 0; i < str.length(); i++) {
                int m = Integer.parseInt(str.charAt(i) + "");
                temp += m * m;
            }
            isHappy(temp);
        }
        return flag;
    }
}
