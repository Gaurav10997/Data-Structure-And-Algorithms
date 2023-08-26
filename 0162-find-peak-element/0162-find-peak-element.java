class Solution {
    public int findPeakElement(int[] nums) {
        
        
        int l = 0 ; 
        int r = nums.length-1; 
        
        while(r-l>1){
            int mid = l+(r-l)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid-1]){
               r=mid-1;
            }else{
               l=mid+1;
            }
        }
        if(nums[l]>nums[r])return l;
        return r;
    }
}