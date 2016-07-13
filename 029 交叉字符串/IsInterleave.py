class Solution:
    """
    @params s1, s2, s3: Three strings as description.
    @return: return True if s3 is formed by the interleaving of
             s1 and s2 or False if not.
    @hint: you can use [[True] * m for i in range (n)] to allocate a n*m matrix.
    """

    def isInterleave(self, part1, part2, s):
        if sorted(s) == sorted(part1 + part2):
            a = []
            i = 0
            try:
                for x in part1:
                    tmp = s.index(x, i)
                    a.append(tmp)
                    i = tmp + 1
                b = []
                i = 0
                for x in part2:
                    tmp = s.index(x, i)
                    b.append(tmp)
                    i = tmp + 1
                print b
            except Exception:
                return False
            if a == sorted(a) and b == sorted(b):
                return True
            return False
        else:
            return False
