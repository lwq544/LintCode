/**
 * 回溯法，指数级时间复杂度，并不可取
 */
public class Solution {
    public static int min = Integer.MAX_VALUE;
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
        if (triangle.length == 1) {
            return triangle[0][0];
        }
        helper(triangle, 0, 0, 0);
        return min;
    }

    public void helper(int[][] triangle, int i, int j, int sum) {
        if (i > triangle.length - 1 || j > triangle[triangle.length - 2].length) {
            if(sum < min) min = sum;
        } else {
            sum += triangle[i][j];
            helper(triangle, i + 1, j, sum);
            helper(triangle, i + 1, j + 1, sum);
        }
    }
}
