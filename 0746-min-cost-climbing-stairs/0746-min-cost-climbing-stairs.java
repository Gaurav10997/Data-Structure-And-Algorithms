class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp [] = new int[cost.length+1];
        return Math.min(recur(cost,0,dp),recur(cost,1,dp));
    }
    private int recur(int []  cost , int i,int[]dp){
        if(i==cost.length)return 0 ;
        if(i>cost.length)return Integer.MAX_VALUE;
        if(dp[i]!=0)return dp[i];
        int lp1 = recur(cost,i+1,dp);
        int lp2 = recur(cost,i+2,dp);
        
        return dp[i]=Math.min(lp1,lp2)+cost[i];
    }
}