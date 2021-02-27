public class MaxProfit {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length < 2){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            //计算相邻两天的收益
            int res = prices[i + 1] - prices[i];
            if (res > 0){
                result += res;
            }
        }
        return result;
    }
}
