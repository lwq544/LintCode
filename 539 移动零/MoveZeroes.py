class Solution:
    # @param {int[]} nums an integer array
    # @return nothing, do this in-place
    def moveZeroes(self, nums):
        # Write your code here
        count = 0
        i = 0
        while 0 <= i < len(nums):
            if all(x == 0 for x in nums[i:]):
                break
            while nums[i] == 0:
                count += 1
                for x in xrange(i, len(nums) - count):
                    nums[x] = nums[x + 1]
                nums[len(nums) - count] = 0
            i += 1
        return nums