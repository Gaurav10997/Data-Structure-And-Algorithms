class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean [][] matrix = new boolean [n][n];
        return NQueens(matrix,0);
        
    }
    // main helper function hai 
    static List<List<String>> NQueens(boolean[][] matrix , int row){
        
        List<List<String>> ans = new ArrayList<>();
        
        if(row==matrix.length){
            ans.add(Queens(matrix));
            return ans;
        }
        
        for(int c = 0 ; c<matrix.length ; c++){
            if(canPlace(matrix, row , c)){
                matrix[row][c]=true;
                ans.addAll(NQueens(matrix, row + 1));
                matrix[row][c]=false;
            }
        }
        return ans;
    }
    
    static boolean canPlace(boolean matrix[][],int row , int col){
        for(int i = 0 ; i< row ; i++){
            if(matrix[i][col]){
                return false;
            }
            
        }
        int minleft = Math.min(row,col);
        for(int i = 0 ; i<=minleft ; i++ ){
            if(matrix[row-i][col-i]){
                return false;
            }
        }
        
        int minright = Math.min(row, matrix.length-1-col);
        for(int i = 0 ; i<=minright ; i++){
            if(matrix[row-i][col+i]){
                return false;
            }
        }
        
        return true;
    }
    
    
    
    
    
    
    
    static List<String> Queens(boolean[][] matrix){
        List<String> ans = new ArrayList<>();
        for(boolean [] row : matrix){
            String str="" ;
            for(boolean el : row){
                if(el){
                    str+="Q";
                }else{
                    str+=".";
                }
            }
            ans.add(str);
            
        }
        return ans;
    }

}