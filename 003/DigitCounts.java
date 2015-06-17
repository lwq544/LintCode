class Solution {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int count = 0;
        for (int i=0; i<=n; i++) {
            String str = i+"";
            for(int j=0;j<str.length(); j++) {
                if(str.charAt(j) == 48+k) {
                    count ++;
                }
            }
        }
        return count;
    }
};

