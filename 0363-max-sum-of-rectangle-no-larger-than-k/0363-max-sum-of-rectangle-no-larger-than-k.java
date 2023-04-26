class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        // prefix sum of this matrix ;
        int rows = matrix.length , cols = matrix[0].length;
        int prefixSum[][] = new int[rows][cols];
        
        for(int row = 0 ; row<rows ; row++){
            for(int col = 0 ; col<cols ; col++){
                int area = matrix[row][col];
                if(row-1>=0){
                    area+=prefixSum[row-1][col];
                }
                if(col-1>=0){
                    area+=prefixSum[row][col-1];
                }
                if(row-1>=0 && col-1>=0){
                     area-=prefixSum[row-1][col-1];
                }
                prefixSum[row][col]=area;               
                
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j< cols; j++){
                for(int m = i ; m<rows ; m++){
                    for(int n = j; n<cols ; n++){
                        int area = prefixSum[m][n];
                        if(i-1>=0){
                            area-=prefixSum[i-1][n];                                                             
                        }
                         if(j-1>=0){
                            area-=prefixSum[m][j-1];
                        }
                         if(j-1>=0 && i-1>=0){
                            area+=prefixSum[i-1][j-1];
                        }
                        if(area<=k){
                            ans = Math.max(ans,area);
                        }
                    }
                }
            }
        }
        return ans;
    }
}