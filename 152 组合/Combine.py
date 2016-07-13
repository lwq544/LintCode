class Solution:
    """    
    @param n: Given the range of numbers
    @param k: Given the numbers of combinations
    @return: All the combinations of k numbers out of 1..n   
    """
    def combine(self, n, k):
        # write your code here
        from itertools import combinations
        return [list(x) for x in combinations(xrange(1, n + 1), k)]