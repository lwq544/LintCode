class Solution:
    """
    @param n: n
    @param k: the k-th permutation
    @return: a string, the k-th permutation
    """
    def nextPermutation(self, num):
        # write your code here
        for i in xrange(len(num) - 1, 0, -1):
            if num[i] > num[i - 1]:
                tmp = num[i - 1]
                b = sorted(num[i:])
                for x in b:
                    if x > tmp:
                        num[i - 1] = x
                        b.remove(x)
                        b.append(tmp)
                        break
                a = num[:i]
                b = sorted(b)
                for x in b:
                    a.append(x)
                return a
        return num[::-1]

    def getPermutation(self, n, k):
        l = [x for x in xrange(1, n+1)]
        for x in xrange(k-1):
            l = self.nextPermutation(l)
        return ''.join(str(x) for x in l)
       
