public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        int a = 1;
        int b = 2;
        int c = 0;
        if(n == 0) return 1;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            for (int i = 1; i <= n - 2; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}