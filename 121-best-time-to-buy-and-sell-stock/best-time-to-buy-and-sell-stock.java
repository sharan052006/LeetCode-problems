class Solution {
    public int maxProfit(int[] prices) {
        int lowest=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(lowest>prices[i]){
                lowest=prices[i];
                continue;
            }
            int profit=prices[i]-lowest;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}