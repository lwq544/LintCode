public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        int m = Integer.valueOf(a, 2);
        int n = Integer.valueOf(b, 2);
        return Integer.toBinaryString(m+n);
    }
}
