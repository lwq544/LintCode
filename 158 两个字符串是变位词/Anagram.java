/**
 * Created by Silocean on 2016-04-01.
 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("abcd", "dcab"));
    }

    public static boolean anagram(String s, String t) {
        if (s.length() != t.length()) return false;
        else {
            boolean flag = true;
            int[] arr = new int[300];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)] += 1;
                arr[t.charAt(i)] -= 1;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    flag = false;
                }
            }
            return flag;
        }
    }
}
