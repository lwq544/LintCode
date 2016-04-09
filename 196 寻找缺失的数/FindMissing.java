/**
 * Created by Silocean on 2016-04-09.
 */
public class FindMissing {
    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{0,1,3}));
    }

    /**
     * @param nums: an array of integers
     * @return: an integer
     */
    public static int findMissing(int[] nums) {
        // write your code here
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == i || nums[i] >= nums.length) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
