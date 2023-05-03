class Solution {
    int res = 0;
    int count = 1;
    public int uniquePathsIII(int[][] grid) {
        int sx=0;
        int sy = 0;
        for(int i = 0; i< grid.length ; i++){
            for(int j = 0; j< grid[0].length ; j++){
                if (grid[i][j] == 0) count++;
                if(grid[i][j]==1){
                    sx=i;
                    sy=j;
                }
            }
        }
        boolean vis[][] = new boolean [grid.length][grid[0].length];
        uniquePathsIIIHelper( grid , sx,sy ,vis);
        return res;
    }
    public void uniquePathsIIIHelper(int [][] grid , int sr , int sc , boolean vis[][] ){
        if(sr<0 || sr>=grid.length || sc<0 || sc>=grid[0].length || vis[sr][sc]==true || grid[sr][sc]==-1){
            return ;
        }
        if(grid[sr][sc]==2){
            if(count==0){
                res++;
            }
        }
        count--;
        vis[sr][sc]=true;
        uniquePathsIIIHelper(grid , sr+1 , sc , vis );
        uniquePathsIIIHelper(grid , sr , sc+1 , vis );
        uniquePathsIIIHelper(grid , sr-1 , sc , vis );
        uniquePathsIIIHelper(grid , sr , sc-1 , vis );
        vis[sr][sc]=false;
        count++;
    }
}