import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-02.
 */
public class Atoi {

    public static ArrayList<Character> chars = new ArrayList<>(Arrays.asList('.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));

    public static void main(String[] args) {
        System.out.println(atoi(""));
    }

    public static int atoi(String str) {
        str = str.trim();
        int result = 0;

        if (str.isEmpty()) return result;

        if (str.contains(".")) {
            result = dealWithFloat(str);
        } else {
            result = dealWithInteger(str);
        }
        return result;
    }

    private static int dealWithInteger(String str) {

        int firstChar = str.charAt(0);
        int index = 0; // 记录当前字符串的正负
        int count = 0;

        while (firstChar == '+' || firstChar == '-') { // 处理开头的正负符号
            if (firstChar == '+') {
                index += 1;
            } else {
                index -= 1;
            }
            count++;
            str = str.substring(1);
            firstChar = str.charAt(0);
        }
        if (count > 1) return 0; // 正负号超过1个，返回0

        for (int i = 0; i < str.length(); i++) {
            if (!chars.contains(str.charAt(i))) {
                str = str.substring(0, i);
            }
        }
        if (str.length() == 0) return 0;

        if (index < 0) { //处理负数
            if (str.length() > 10) { // 长度太长
                return Integer.MIN_VALUE;
            } else if (str.length() == 10 && str.compareTo("2147483648") > 0) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.parseInt("-" + str);
            }
        } else { // 处理正数
            if (str.length() > 10) { // 长度太长
                return Integer.MAX_VALUE;
            } else if (str.length() == 10 && str.compareTo("2147483647") > 0) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.parseInt(str);
            }
        }
    }

    private static int dealWithFloat(String str) {
        String integerStr = str.split("\\.")[0];
        return dealWithInteger(integerStr);
    }
}
