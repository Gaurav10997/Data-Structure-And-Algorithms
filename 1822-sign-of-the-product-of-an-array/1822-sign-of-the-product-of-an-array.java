class Solution {
    public int arraySign(int[] nums) {
         int nnegative = 0;
         int npositive =10;
         int nzero = 0;
 
        for(int i : nums){
           if(i<0){
               nnegative++;
           }if(i==0){
               nzero++;
           }
        }
        if(nzero>=1){
            return 0;
        }
        else if(nnegative%2==0){
            return 1;
        }else if(nnegative%2==1){
            return -1;
        }
        return 9;
        
    }
}