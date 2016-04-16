package CountOfSmallerNumber;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-16.
 */
public class CountOfSmallerNumberII {
    public static void main(String[] args) {
        ArrayList<Integer> result = countOfSmallerNumber(new int[]{1, 2, 7, 8, 5}, new int[]{1, 12, 6});
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
            result.add(binarySearch(A, queries[i]));
        }
        return result;
    }

    private static int binarySearch(int[] A, int number) {
        if (A.length == 0) return 0;
        int start = 0;
        int end = A.length - 1;
        int mid = 0;
        while (start + 1 < end) {
            mid = (start + end) / 2;
            if (number > A[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (A[start] >= number) {
            return start;
        }
        if (A[end] >= number) {
            return end;
        }
        return end + 1;
    }
}
