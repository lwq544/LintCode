/**
 * Created by Silocean on 2016-05-06.
 */
public class JumpII {

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 1, 1, 1, 4}));
    }

    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */ // 2 1 1 1 4
    public static int jump(int[] A) {
        // write your code here
        int count = 0;
        int i = 0;
        int step = A[0];
        while (i != A.length - 1) {
            if (step >= A.length - i - 1) {
                count++;
                break;
            } else {
                int t = i;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int j = t + 1; j <= t + step; j++) {
                    if (A[j] > max) {
                        max = A[j];
                        i = j;
                    }
                    if (A[j] < min) {
                        min = A[j];
                    }
                }
                if (max == min) {
                    i = t;
                    i += step;
                }
                step = max;
                count++;
            }
        }
        return count;
    }
}
