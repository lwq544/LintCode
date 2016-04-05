import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-05.
 */
public class SmallestDifference {
    public static void main(String[] args) {
        System.out.println(smallestDifference(new int[]{3, 4, 6, 7}, new int[]{2, 3, 8, 9}));
    }

    public static int smallestDifference(int[] A, int[] B) {
        // write your code here
        if (A.length == 0 || B.length == 0) return 0;

        int min = Integer.MAX_VALUE;

        Arrays.sort(A);
        Arrays.sort(B);

        int indexA = 0;
        int indexB = 0;

        while (indexA < A.length && indexB < B.length) {
            min = Math.min(min, Math.abs(A[indexA] - B[indexB]));
            if (A[indexA] < B[indexB]) {
                indexA++;
            } else {
                indexB++;
            }
        }

        return min;
    }
}
