class Solution:
    # @param num :  a list of integer
    # @return : a list of integer
    def nextPermutation(self, num):
        # write your code here
        for i in xrange(len(num) - 1, 0, -1):
            if num[i] > num[i - 1]:
                tmp = num[i-1]
                b = sorted(num[i:])
                for x in b:
                    if x > tmp:
                        num[i-1] = x
                        b.remove(x)
                        b.append(tmp)
                        break
                a = num[:i]
                b = sorted(b)
                for x in b:
                    a.append(x)
                return a
        return num[::-1]