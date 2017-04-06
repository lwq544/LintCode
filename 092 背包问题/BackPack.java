public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
        int n = A.length;
        int[][] f = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = f[i - 1][j];
                if (j - A[i - 1] >= 0) {
                    f[i][j] = max(f[i - 1][j], f[i - 1][j - A[i - 1]] + A[i - 1]);
                }
            }
        }
        return f[n][m];
    }
    public int max(int a, int b){
        return a > b ? a : b;
    }
}