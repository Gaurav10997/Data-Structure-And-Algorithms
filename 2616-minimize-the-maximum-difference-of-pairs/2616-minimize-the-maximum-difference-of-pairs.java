class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l = 0 ; 
        int r = 1000000000;
        int ans=1000000000 ;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isValid(nums,mid,p)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    
    public boolean isValid(int nums[],int threesold,int p){
        int cnt =0;
        for(int i = 0 ; i<nums.length-1 ;i++){
            if(Math.abs(nums[i]-nums[i+1])<=threesold){
                cnt++;
                i++;
            }
        }
        return cnt>=p;
    }
}