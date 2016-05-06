/**
 * Created by Silocean on 2016-05-06.
 */
public class DeleteDigits {

    public static void main(String[] args) {
        System.out.println(DeleteDigits("1111222", 2));
    }

    /**
     * @param A: A positive integer which has N digits, A is a string.
     * @param k: Remove k digits.
     * @return: A string
     */
    public static String DeleteDigits(String A, int k) {
        // write your code here
        StringBuilder str = new StringBuilder(A);
        int len = A.length();
        while (str.length() > (len - k)) {
            int i = 0;
            while (i < str.length() - 1 && str.charAt(i) <= str.charAt(i + 1)) {
                i++;
            }
            if (i == str.length() - 1) {
                str = str.deleteCharAt(str.length() - 1);
            } else {
                str = str.deleteCharAt(i);
            }
        }
        // 删除串首可能产生的无用的0
        while (str.length() > 1 && str.charAt(0) == '0') {
            str = str.deleteCharAt(0);
        }
        return str.toString();
    }
}
