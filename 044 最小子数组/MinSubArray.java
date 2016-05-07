import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-05-07.
 */
public class MinSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 1, 3));
        System.out.println(minSubArray(nums));
    }

    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public static int minSubArray(ArrayList<Integer> nums) {
        // write your code
        int minSum = nums.get(0);
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            if (sum < minSum) {
                minSum = sum;
            }
            if (sum > 0) {
                sum = 0;
            }
        }
        return minSum;
    }
}
