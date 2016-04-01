class Solution:
    # @param nums: The integer array
    # @param target: Target number to find
    # @return the first position of target in nums, position start from 0 
    def binarySearch(self, nums, target):
        # write your code here
        start = 0
        end = len(nums) - 1
        while start <= end:
            middle = (start + end) / 2
            if target == nums[middle]:
                for x in range(start, middle):
                    if nums[x] == target:
                        return x
                return middle
            elif target < nums[middle]:
                end = middle - 1
            else:
                start = middle + 1
        return -1
        
