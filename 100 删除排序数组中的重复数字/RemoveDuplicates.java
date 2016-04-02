public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -14, -14, -13, -13, -13, -13, -13, -13, -13, -12, -12,
				-12, -12, -11, -10, -9, -9, -9, -8, -7, -5, -5, -5, -5, -4, -3,
				-3, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 1, 1, 1, 1, 2, 2, 2,
				3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 8, 8, 8, 9, 9, 9,
				10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 14, 14, 14, 14, 15, 16,
				16, 16, 18, 18, 18, 19, 19, 19, 19, 20, 20, 20, 21, 21, 21, 21,
				21, 21, 22, 22, 22, 22, 22, 23, 23, 24, 25, 25 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums == null) {
			return 0;
		}
		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[size]) {
				nums[++size] = nums[i];
			}
		}
		return size + 1;
	}

}
