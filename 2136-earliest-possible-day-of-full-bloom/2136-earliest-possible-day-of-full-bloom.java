class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length ;
        int mat [][] = new int [n][2];
        
        for(int i = 0 ; i< n ; i++){
            mat[i][0] = plantTime[i];
            mat[i][1] = growTime[i];
        }
        
        
        Arrays.sort(mat,(a,b)->b[1]-a[1]);
        int bloomday = 0 ;
        int lastday = 0 ;
        for(int i = 0 ; i< n ; i++){
            
            int pt = mat[i][0];
            int gt = mat[i][1];
            
            bloomday = Math.max(bloomday , lastday+pt+gt);
            lastday +=pt; 
        }
        
        return bloomday;
    }
}