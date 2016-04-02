/**
 * Created by Silocean on 2016-04-02.
 */
public class SearchRange {
    public static void main(String[] args) {
        int[] range = searchRange(new int[]{7, 7, 8, 8, 10}, 7);
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i] + ",");
        }
    }

    public static int[] searchRange(int[] A, int target) {
        int[] range = new int[2];
        int index = binarySearch(A, target);
        int start = index;
        int end = index;
        while ((start - 1) >= 0 && A[start - 1] == target) {
            start--;
        }
        while ((end + 1) < A.length && A[end + 1] == target) {
            end++;
        }
        range[0] = start;
        range[1] = end;
        return range;
    }

    private static int binarySearch(int[] A, int target) {
        int index = -1;
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] > target) {
                end = mid - 1;
            } else if (A[mid] < target) {
                start = mid + 1;
            } else {
                index = mid;
                return index;
            }
        }
        return index;
    }
}
