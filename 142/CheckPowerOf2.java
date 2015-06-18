class Solution {
    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        boolean flag = true;
        if(n<0) {
            flag = false;
        } else {
            String binaryString = Integer.toBinaryString(n);
            if(binaryString.startsWith("1")) {
                for(int i=1; i<binaryString.length(); i++) {
                    if(binaryString.charAt(i) != '0') {
                        flag = false;
                    }
                }
            } else {
                flag = false;
            }
        }
        return flag;
    }
};
