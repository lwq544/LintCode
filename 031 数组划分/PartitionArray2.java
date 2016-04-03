/**
 * Created by Silocean on 2016-04-03.
 */
public class PartitionArray2 {
    public static void main(String[] args) {
        System.out.println(partitionArray(new int[]{3, 2, 3, 5, 7, 3, 6, 8, 3, 9, 3, 4, 3, 0}, 7));
    }

    /**
     * @param nums: The integer array you should partition
     * @param k:    As description
     *              return: The index after partition
     */
    public static int partitionArray(int[] nums, int k) {
        //write your code here
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] < k) {
                i++;
                if (i >= nums.length) return nums.length;
            }
            while (nums[j] >= k) {
                j--;
                if (j < 0) return 0;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        for (int l = 0; l < nums.length; l++) {
            System.out.print(nums[l] + " ");
        }
        System.out.println();
        return i;
    }

}
