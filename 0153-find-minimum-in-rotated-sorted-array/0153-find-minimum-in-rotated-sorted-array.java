class Solution {
    public int findMin(int[] nums) {
       int l = 0 , r = nums.length-1; 
       int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+(r-l)/2;
            //left sorted array 
            if(nums[l]<=nums[mid]){
                // if(target<nums[l] || target>nums[mid]){
                //     l=mid+1;
                // }else{
                //     r=mid-1;
                // }
                ans=Math.min(ans,nums[l]);
                 l=mid+1;
            }
            else{
//                   if(target<nums[mid] || target>nums[r]){
//                        r=mid-1;
                  
//                 }else{
//                      l=mid+1;
//                 }
                  ans=Math.min(ans,nums[mid]);
                 r=mid-1;
            }
        }
        return ans;
    }
}