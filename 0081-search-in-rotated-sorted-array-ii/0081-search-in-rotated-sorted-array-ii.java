class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0 , r = nums.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(nums[mid]==target)return true;

            //left sorted array
            if(nums[l]<nums[mid]){
                if(target<nums[l] || target>nums[mid] ){
                    l=mid+1;
                }else{
                    r=mid-1;
                }

            }else if(nums[l]>nums[mid]){
                if(target<nums[mid] || target>nums[r]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                l+=1;
            }
        }
        return false;
    }
}