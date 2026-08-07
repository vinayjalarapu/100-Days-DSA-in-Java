class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];

            }
            int currprofit=prices[i]-buyprice;
            profit=Math.max(currprofit,profit);
        }
        return profit;
    }
}
