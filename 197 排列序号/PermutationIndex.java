/**
 * Created by Silocean on 2016-04-07.
 */
public class PermutationIndex {
    public static void main(String[] args) {
        System.out.println(permutationIndex(new int[]{4, 5, 3, 1, 2}));
    }

    public static long permutationIndex(int[] A) {
        long result = 1;

        for (int i = 0; i < A.length; i++) {
            int m = A[i];
            int count = 0;
            for (int j = i; j < A.length; j++) {
                if (A[j] < m) {
                    count++;
                }
            }
            result += count * factorial(A.length - i - 1);
        }

        return result;
    }

    /**
     * 求阶乘
     *
     * @param n
     * @return
     */
    public static long factorial(int n) {
        long result = 1;
        while (n >= 1) {
            result *= n;
            n--;
        }
        return result;
    }
}
