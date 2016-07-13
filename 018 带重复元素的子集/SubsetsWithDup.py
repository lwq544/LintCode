class Solution:
    """
    @param S: A set of numbers.
    @return: A list of lists. All valid subsets.
    """
    def subsetsWithDup(self, s):
        from itertools import combinations
        # write your code here
        l = [sorted(list(c)) for i in range(len(s) + 1) for c in combinations(s, i)]
        result = []
        for x in l:
            if x not in result:
                result.append(x)
        return result
        