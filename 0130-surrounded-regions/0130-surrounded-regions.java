class Solution {
    public void solve(char[][] board) {
        
        boolean vis [][] = new boolean [board.length][board[0].length];
        for(int i = 0 ; i< board[0].length ; i++){
             dfs(board,0,i,vis);
             dfs(board,board.length-1 , i,vis);
        }
        
        for(int i = 1 ; i<board.length-1 ; i++){
             dfs(board,i,0,vis);
             dfs(board , i,board[0].length-1,vis);
        }
        for(int i = 0 ; i<board.length; i++ ){
            for(int j = 0 ; j<board[0].length ; j++){
                if(board[i][j]=='O')board[i][j]='X';
                 if(board[i][j]=='Z')board[i][j]='O';
            }
        }
        
        
        
       
    }
    public void dfs(char [][] board, int row , int column,boolean vis [][]){

       if(row<0 || column<0 || row>=board.length || column>=board[0].length || vis[row][column] || board[row][column]=='X'){
           return;
       }
        
        vis[row][column]=true;
        board[row][column]='Z';
        dfs(board,row,column-1,vis);
        dfs(board,row-1,column,vis);
        dfs(board,row,column+1,vis);
        dfs(board,row+1,column,vis);
       
    }
    
}