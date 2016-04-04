/**
 * Created by Silocean on 2016-04-04.
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }

    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public static boolean isPalindrome(String s) {
        // Write your code here
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < s.length() && !Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j))) {
                j--;
            }
            if (i < s.length() && j >= 0 && s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
