class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int rows = matrix.length;
        for(int i = 0; i< rows ; i++ ){
            for(int j = 0; j<rows ; j++){
                pq.add(matrix[i][j]);
            }
        }
        // 1,2,3 1st smallest is 2 so 
        
        while(k>1){
            System.out.println(pq.remove());
            k--;
        }
        return pq.remove();
    }
}