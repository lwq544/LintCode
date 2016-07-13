class Solution:
    """
    @param nums: A list of integers.
    @return: A list of unique permutations.
    """
    def permuteUnique(self, nums):
        # write your code here
        from itertools import permutations
        l = [list(x) for x in permutations(nums)]
        result = []
        for x in l:
            if x not in result:
                result.append(x)
        return result
