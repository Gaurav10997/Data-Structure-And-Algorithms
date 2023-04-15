class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE ; 
        int max = 0 ; 
        
        for(int i = 0 ; i< prices.length ; i++){
            if(lsf>prices[i]){
                lsf= prices[i] ;
            }
            int profit = prices[i]-lsf;
            
            max = Math.max(profit,max);
        }
        return max;
        
    }
}