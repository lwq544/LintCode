/**
 * Created by Silocean on 2016-03-30.
 */
public class PartitionArray {

    public static int[] nums = {9, 7, 4, 3, 5, 6, 8, 2};

    public static void main(String[] args) {
        partitionArray2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void partitionArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp;
            if (nums[i] % 2 != 0) {
                temp = nums[i];
                for (int j = i - 1; j >= 0; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[0] = temp;
            }
        }
    }

    public static void partitionArray2(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] % 2 != 0) i++;
            while (nums[j] % 2 == 0) j--;
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}
