/**
 * Created by Silocean on 2016-04-10.
 */
public class RemoveDuplicatesII {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length <= 2) return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2])
                nums[index++] = nums[i];
        }
        return index;
    }
}
