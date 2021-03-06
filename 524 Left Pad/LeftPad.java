/**
 * Created by Silocean on 2016-04-19.
 */
public class LeftPad {
    public static void main(String[] args) {
        System.out.println(leftPad("1", 2, '0'));
    }

    /**
     * @param originalStr the string we want to append to with spaces
     * @param size        the target length of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size) {
        // Write your code here
        return leftPad(originalStr, size, ' ');
    }

    /**
     * @param originalStr the string we want to append to
     * @param size        the target length of the string
     * @param padChar     the character to pad to the left side of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        // Write your code here
        StringBuilder newStr = new StringBuilder(originalStr);
        if (size > originalStr.length()) {
            for (int i = 0; i < size - originalStr.length(); i++) {
                newStr.insert(0, padChar);
            }
        }
        return newStr.toString();
    }
}
