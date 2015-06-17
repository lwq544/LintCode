class Solution {
    //param k : description of k
    //param numbers : array of numbers
    //return: description of return
    public int kthLargestElement(int k, ArrayList<Integer> numbers) {
        // write your code here
        int max = Integer.MIN_VALUE;
        int index = 0;
        while (k>0) {
            max = Integer.MIN_VALUE;
            for (int i=0; i<numbers.size(); i++) {
                if(numbers.get(i) > max) {
                    max = numbers.get(i);
                    index = i;
                }
            }
            numbers.remove(index);
            k--;
            //System.out.println(numbers);
        }
        return max;
    }
};
