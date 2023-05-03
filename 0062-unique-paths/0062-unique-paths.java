class Solution {
    int dp[][] = new int [101][101];
    public int uniquePaths(int m, int n) {
        return uniquePathsHelper(m,n,0,0);
    }
    public int uniquePathsHelper(int m , int n , int i , int j){
        if(i>=m || j>=n){
            return 0;
        }if(i==m-1 && j==n-1){
            return 1;
        }if(dp[i][j]!=0)return dp[i][j];
       dp[i][j]= uniquePathsHelper(m,n , i+1 ,j) + uniquePathsHelper(m,n , i ,j+1);
       return dp[i][j];
    }
}