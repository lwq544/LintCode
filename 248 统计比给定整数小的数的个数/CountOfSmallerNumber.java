package CountOfSmallerNumber;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-16.
 */
public class CountOfSmallerNumber {
    public static void main(String[] args) {
        ArrayList<Integer> result = countOfSmallerNumber(new int[]{1, 2, 7, 8, 5}, new int[]{1, 8, 5});
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    /**
     * @param A: An integer array
     * @return: The number of element in the array that
     * are smaller that the given integer
     */
    public static ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(A);
        for (int i = 0; i < queries.length; i++) {
            result.add(helper(A, queries[i]));
        }

        return result;
    }

    private static int helper(int[] A, int num) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < num) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
