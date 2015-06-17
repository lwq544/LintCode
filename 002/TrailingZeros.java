class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        long count = 0;
        while (n/5 > 0) {
            n = n / 5;
            count += n;
        }
        return count;
    }
};

