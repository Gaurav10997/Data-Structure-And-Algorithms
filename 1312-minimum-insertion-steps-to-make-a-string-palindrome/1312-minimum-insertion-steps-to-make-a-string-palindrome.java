class Solution {
public int minInsertions(String s) {
        String r = new StringBuilder(s).reverse().toString();
        return s.length() - lcs(s, r);
    }
    private int lcs(String s, String r) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                dp[i + 1][j + 1] = s.charAt(i) == r.charAt(j) ? dp[i][j] + 1 : Math.max(dp[i + 1][j], dp[i][j + 1]);
        return dp[n][n];        
    }
}