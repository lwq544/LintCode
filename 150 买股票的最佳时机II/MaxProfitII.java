/**
 * Created by Silocean on 2016-04-06.
 */
public class MaxProfitII {
    public static void main(String[] args) {
        int[] prices = new int[]{4, 7, 6, 2, 1, 9, 3};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                result += prices[i + 1] - prices[i];
            }
        }
        return result;
    }

}
