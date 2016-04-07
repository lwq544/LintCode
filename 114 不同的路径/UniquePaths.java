/**
 * Created by Silocean on 2016-04-07.
 */
public class UniquePaths {

    public static int count = 0;

    public static int[] incrementX = {0, 1};
    public static int[] incrementY = {1, 0};

    public static void main(String[] args) {
        System.out.println(uniquePaths(8, 68));
    }

    /**
     * 动态规划
     *
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            sum[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            sum[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
            }
        }
        return sum[m - 1][n - 1];
    }

    /**
     * 回溯
     *
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public static int uniquePaths2(int m, int n) {
        // write your code here
        helper(m, n, 1, 1);
        return count;
    }

    public static void helper(int m, int n, int i, int j) {
        int x, y;
        if (i == m && j == n) {
            count++;
            return;
        } else {
            for (int k = 0; k < 2; k++) {
                x = i + incrementX[k];
                y = j + incrementY[k];
                if (x >= 1 && x <= m && y >= 1 && y <= n) {
                    helper(m, n, x, y);
                }
            }
        }
    }
}
