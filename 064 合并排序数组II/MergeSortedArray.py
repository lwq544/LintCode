class Solution:
    """
    @param A: sorted integer array A which has m elements, 
              but size of A is m+n
    @param B: sorted integer array B which has n elements
    @return: void
    """

    def mergeSortedArray(self, A, m, B, n):
        # write your code here
        for x in xrange(n):
            A[m + x] = B[x]
        return A.sort()
