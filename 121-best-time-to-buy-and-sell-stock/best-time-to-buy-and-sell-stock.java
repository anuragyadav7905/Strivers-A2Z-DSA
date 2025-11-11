class Solution {
    public int maxProfit(int[] prices) {
        int Profit=0;
        int mini=prices[0];

        for(int i =0;i<prices.length;i++){
            int curProfit=prices[i]-mini;
            Profit=Math.max(Profit,curProfit);
            mini=Math.min(mini,prices[i]);
        }
        return Profit;
    }
}