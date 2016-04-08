/**
 * Created by Silocean on 2016-04-08.
 */
public class LongestIncreasingContinuousSubsequence {

    public static void main(String[] args) {
        int[] A = {5, 6, 7, 1, 2, 3, 4};
        System.out.println(longestIncreasingContinuousSubsequence(A));
    }

    public static int longestIncreasingContinuousSubsequence(int[] A) {
        int max = 0;
        if (A.length == 1) return 1;
        for (int i = 0; i < A.length - 1; i++) {
            int count = 1; // 当前连续子序列的长度
            int j = i; // 之前的位移
            if (A[i + 1] > A[i]) { // 如果后一个数比前一个数大
                while (j < A.length - 1 && A[j + 1] > A[j]) {
                    count++;
                    j++;
                }
            } else if (A[i + 1] < A[i]) { // 如果后一个数比前一个数小
                while (j < A.length - 1 && A[j + 1] < A[j]) {
                    count++;
                    j++;
                }
            }
            if (count > max) {
                max = count;
            }
            i += count - 2;
        }
        return max;
    }
}
