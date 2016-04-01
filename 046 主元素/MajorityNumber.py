class Solution:
    """
    @param nums: A list of integers
    @return: The majority number
    """
    def majorityNumber(self, nums):
        # write your code here
        dic = {}
        for x in nums:
            if dic.has_key(x):
                dic[x] = dic[x] + 1
            else:
                dic[x] = 1;
        for k, v in dic.items():
            if v > len(nums)/2:
                return k

