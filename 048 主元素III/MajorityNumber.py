class Solution:
    """
    @param nums: A list of integers
    @param k: As described
    @return: The majority number
    """

    def majorityNumber(self, nums, k):
        # write your code here
        return [x for x in nums if nums.count(x) > len(nums) / float(k)][0]
