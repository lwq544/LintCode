class Solution:
    # @param {int[]} nums1 an integer array
    # @param {int[]} nums2 an integer array
    # @return {int[]} an integer array
    def intersection(self, nums1, nums2):
        # Write your code here
        result = []
        if not nums1 or not nums2:
            return result
        nums1 = list(set(nums1))
        nums2 = sorted(nums2)
        for x in nums1:
            if self.binary_search(nums2, x):
                result.append(x)
        return result

    def binary_search(self, lst, target):
        start = 0
        end = len(lst) - 1
        while start + 1 < end:
            mid = (start + end) / 2
            if lst[mid] < target:
                start = mid
            elif lst[mid] > target:
                end = mid
            else:
                return True
        if lst[start] == target:
            return True
        if lst[end] == target:
            return True
        return False
