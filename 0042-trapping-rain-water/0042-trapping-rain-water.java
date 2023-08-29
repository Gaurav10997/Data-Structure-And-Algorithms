class Solution {
    public int trap(int[] nums) {
        int l = 0 ; 
        int res = 0 ;
        int r = nums.length-1 ;
        int lmax = nums[l];
        int rmax = nums[r];
        
        while(l<r){
            if(lmax>rmax){
                r--; 
                rmax = Math.max(rmax, nums[r]);
                res+=rmax-nums[r];
            }else{
                l++; 
                lmax= Math.max(nums[l],lmax);
                res+=lmax-nums[l];
            }
        }
        return res;
    }
}