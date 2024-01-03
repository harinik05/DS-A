class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        //one pass approach to this question - solved using O(n) time complexity
         int minPrice = Integer.MAX_VALUE;
         int maxProfit = 0;

         //loop through the entire prices array 
         for(int i = 0;i<prices.length;i++){
             //check if the min price is true
             if(prices[i]<minPrice){
                 minPrice = prices[i];
             }

             //check if the max profit is true
             if(prices[i]-minPrice > maxProfit){
                 maxProfit = prices[i]-minPrice;
             }
         }
         return maxProfit;
    }
}
