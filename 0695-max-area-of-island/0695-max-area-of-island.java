class Solution {
    int ans = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length ;
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<column ; j++){
                if(grid[i][j]==1){
                    ans = Math.max(dfs(grid,i,j),ans);
                    System.out.println(ans);
                }
            }
        }
        return ans;
        
    }
    
    public int dfs(int [][] grid , int i , int j ){
      
         if(i>=grid.length || i<0 || j>=grid[0].length || j<0 ||  grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int left = dfs(grid,i,j-1);
        int right = dfs(grid,i,j+1);
        int top =dfs(grid,i-1,j);
        int bottom = dfs(grid,i+1,j);
        return left+right+top+bottom+1;
    }
}