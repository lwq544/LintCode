import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-02.
 */
public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {9, 3, 2, 4, 8};
        System.out.println(kthLargestElement2(3, nums));
    }

    /**
     * 时间复杂度为O(K*N)，不适用数组太大的情况。
     *
     * @param k
     * @param nums
     * @return
     */
    public static int kthLargestElement(int k, int[] nums) {
        int max = Integer.MIN_VALUE;
        while (k > 0) {
            max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            nums[index] = Integer.MIN_VALUE;
            k--;
        }
        return max;
    }

    public static int kthLargestElement2(int k, int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
