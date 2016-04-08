/**
 * Created by Silocean on 2016-04-08.
 */
public class SortLetters {
    public static void main(String[] args) {
        char[] chars = new char[]{'A', 'B', 'C', 'D', 'e'};
        sortLetters(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    /**
     * @param chars: The letter array you should sort by Case
     * @return: void
     */
    public static void sortLetters(char[] chars) {
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            while (start < chars.length && Character.isLowerCase(chars[start])) {
                start++;
            }
            while (end >= 0 && Character.isUpperCase(chars[end])) {
                end--;
            }
            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
            }
            start++;
            end--;
        }
    }
}
