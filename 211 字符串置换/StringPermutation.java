/**
 * Created by Silocean on 2016-03-31.
 */
public class StringPermutation {
    public static void main(String[] args) {
        System.out.println(stringPermutation("aabc", "bac"));
    }

    public static boolean stringPermutation(String A, String B) {
        // Write your code here
        int[] arr = new int[500];
        for (int i = 0; i < A.length(); i++) {
            arr[(int) A.charAt(i)] += 1;
        }
        for (int i = 0; i < B.length(); i++) {
            arr[(int) B.charAt(i)] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }

}
