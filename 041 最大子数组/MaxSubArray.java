/**
 * Created by Silocean on 2016-04-01.
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, -7, -1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            if (curSum > maxSum) maxSum = curSum;
            if (curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}
