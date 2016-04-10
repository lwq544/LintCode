/**
 * Created by Silocean on 2016-04-10.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"abcdefg", "abcefg", "abcdfa"};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < strs[i].length() && j < prefix.length() && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            if (j == 0) return "";
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
