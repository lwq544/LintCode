/**
 * Created by Silocean on 2016-04-06.
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{4, 7, 6, 2, 1, 9, 3};
        System.out.println(maxProfit2(prices));
    }

    /**
     * O(n^2)
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        // write your code here
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    /**
     * O(n)
     *
     * @param prices
     * @return
     */
    public static int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if ((prices[i] - min) > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
