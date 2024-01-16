package Best_Time_To_Buy_And_Sell_Stocks;

class Solution1 {
    public int maxProfit(int[] prices) {
        //1. define the max profits
        int maxProfit = 0;

        //2. calculate it
        for(int i = 0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
            }
        }

        //3. return maxProfit
        return maxProfit;
    }
}
