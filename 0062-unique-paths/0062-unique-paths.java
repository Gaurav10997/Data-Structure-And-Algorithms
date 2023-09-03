class Solution {
     int dp[][] = new int [101][101];
    public int uniquePaths(int m, int n) {
        return uniquePathsHelper(0,0,m,n);
    }
    public int uniquePathsHelper(int m , int n, int mh , int nh){
        if(m==mh || n==nh){
            return 0;
        }
        if(m==mh-1 && n==nh-1){
            return 1;
        }if(dp[m][n]!=0)return dp[m][n];

        dp[m][n] = uniquePathsHelper(m+1,n,mh,nh)+uniquePathsHelper(m,n+1,mh,nh);
        return dp[m][n];
    }
    
    
}