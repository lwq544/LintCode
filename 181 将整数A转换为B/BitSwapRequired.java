/**
 * Created by Silocean on 2016-04-04.
 */
public class BitSwapRequired {
    public static void main(String[] args) {
        System.out.println(bitSwapRequired2(67, 31));
    }

    public static int bitSwapRequired(int a, int b) {
        // write your code here
        String a_str = Integer.toBinaryString(a);
        String b_str = Integer.toBinaryString(b);
        int result = 0;
        int a_len = a_str.length();
        int b_len = b_str.length();

        if (a_len < b_len) {
            for (int i = 0; i < b_len - a_len; i++) {
                a_str = "0" + a_str;
            }
        } else if (a_len > b_len) {
            for (int i = 0; i < a_len - b_len; i++) {
                b_str = "0" + b_str;
            }
        }
        for (int i = 0; i < a_str.length(); i++) {
            if (a_str.charAt(i) != b_str.charAt(i)) {
                result += 1;
            }
        }
        return result;
    }

    /**
     * 不懂
     *
     * @param a
     * @param b
     * @return
     */
    public static int bitSwapRequired2(int a, int b) {
        // write your code here
        int count = 0;
        for (int c = a ^ b; c != 0; c = c >>> 1) {
            count += c & 1;
        }
        return count;
    }
}
