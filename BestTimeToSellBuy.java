public class BestTimeToSellBuy {

    static class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price; // update min price
                } else if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice; // update profit
                }
            }

            return maxProfit;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Max profit for [7,1,5,3,6,4]: " + sol.maxProfit(prices1));
        System.out.println("Max profit for [7,6,4,3,1]: " + sol.maxProfit(prices2));
    }
}
