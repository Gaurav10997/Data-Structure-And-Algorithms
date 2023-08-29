class Solution {
    public int trap(int[] height) {
        int l = 0 ; 
        int res = 0 ;
        int r = height.length-1 ; 
        int lmax = height[l];
        int rmax = height[r];
        while(l<r){  
            if(lmax<rmax){
                l++;
                lmax=Math.max(height[l],lmax);
                res+=lmax - height[l];
             
            }else{             
                r--;
                rmax = Math.max(height[r],rmax);
                res+=rmax - height[r];
               
            }
        }
        return res;
    }
}