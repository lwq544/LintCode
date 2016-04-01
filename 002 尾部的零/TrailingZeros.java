class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        long count = 0;
        while (n / 5 > 0) { // 5*2=10，显然2的个数比5多，所以只要算出5的个数
            n = n / 5;
            count += n;
        }
        return count;
    }
};

