class Solution {
    public int maxProfit(int[] prices) {
        int Profit=0; //profit
        int mini=prices[0]; //minimum

        for(int i =0;i<prices.length;i++){
            int curProfit=prices[i]-mini;  // current profit
            Profit=Math.max(Profit,curProfit);  //profit update
            mini=Math.min(mini,prices[i]);     // minimum update
        }
        return Profit;
    }
}