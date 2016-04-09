/**
 * Created by Silocean on 2016-04-09.
 */
public class NextPermutation {
    public static void main(String[] args) {
        nextPermutation(new int[]{2,3,5,4});
    }

    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        for (; i >= 1; ) {
            if (nums[i] <= nums[i - 1]) {
                i--;
            } else {

                int index = i;

                for (int j = i; j < nums.length; j++) {
                    if (nums[i - 1] < nums[j]) {
                        index++;
                    }
                }

                int temp = nums[index - 1];
                nums[index - 1] = nums[i - 1];
                nums[i - 1] = temp;

                break;
            }
        }

        int start = i;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
