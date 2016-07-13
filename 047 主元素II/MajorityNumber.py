class Solution:
    """
    @param nums: A list of integers
    @return: The majority number occurs more than 1/3
    """
    def majorityNumber(self, nums):
        # write your code here
        return [x for x in nums if nums.count(x)>len(nums)/3.0][0]
