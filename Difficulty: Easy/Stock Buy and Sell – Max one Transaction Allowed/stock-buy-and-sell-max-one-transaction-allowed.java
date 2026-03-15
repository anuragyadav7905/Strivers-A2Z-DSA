class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int min=prices[0];
        int maxProfit=0;
        
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            int profit=prices[i]-min;
            
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
        
    }
}