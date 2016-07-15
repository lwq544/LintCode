class Solution:
    # @param {int[]} nums1 an integer array
    # @param {int[]} nums2 an integer array
    # @return {int[]} an integer array
    def intersection(self, nums1, nums2):
        from collections import Counter
        count = Counter(nums1)
        result = []
        for x in nums2:
            if count[x] > 0:
                result.append(x)
                count[x] -= 1
        return result
