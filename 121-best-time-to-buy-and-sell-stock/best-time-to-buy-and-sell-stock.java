class Solution {
    public int maxProfit(int[] prices) {
        int bestbuy=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bestbuy){
                bestbuy=prices[i];
            }
            else if(prices[i]>bestbuy){
                maxprofit=Math.max(maxprofit,prices[i]-bestbuy);
            }
        }
        return maxprofit;
    }
}