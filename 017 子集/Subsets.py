class Solution:
    """
    @param S: The set of numbers.
    @return: A list of lists. See example.
    """
    def subsets(self, s):
        # write your code here
        from itertools import combinations
        return [sorted(list(c)) for i in range(len(s) + 1) for c in combinations(s, i)]