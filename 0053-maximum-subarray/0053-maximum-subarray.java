class Solution {
    public int maxSubArray(int[] arr) {
        int maxsum =Integer.MIN_VALUE ; 
        int cs = 0 ;
        
        for(int i = 0 ; i< arr.length ; i++){
            cs+=arr[i];
            if(cs>maxsum){
                maxsum=cs;
            }if(cs<0){
                cs=0;
            }
        }
        return maxsum;
    }
}