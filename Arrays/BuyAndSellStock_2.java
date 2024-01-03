class BuyAndSellStock_2 {
    public int maxProfit(int[] prices) {
        //one pass approach - add up A + B + C+ D = height from the peak to valley
        int maxProfit = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit +=prices[i]-prices[i-1];
            }
        }
        return maxProfit;

    }
}
