package Best_Time_To_Buy_And_Sell_Stocks;

class Solution2 {
    public int maxProfit(int[] prices) {
        //1. define the max profit
        int maxProfit = 0;
        int minNumber = Integer.MAX_VALUE;

        //2. one pass method with the for loop
        for(int i = 0;i<prices.length;i++){
            //2a. reset the minnum
            if(prices[i] < minNumber){
                minNumber= prices[i];
            }

            //2b. reset the maxProfit
            else if(prices[i]-minNumber > maxProfit){
                maxProfit = prices[i] - minNumber;
            }
        }

        //3. return the max profit
        return maxProfit;
    }
}

