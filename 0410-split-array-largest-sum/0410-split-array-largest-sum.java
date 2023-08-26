class Solution {
    public int splitArray(int[] nums, int k) {
        int l = Arrays.stream(nums).max().getAsInt(); ; 
        int r = Arrays.stream(nums).sum();
        int ans = 0 ; 
        while(l<=r){
           
            int mid = l+(r-l)/2;
            // System.out.println("mid "+mid);
            
            if(canSplit(nums,mid,k)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    
    public boolean canSplit(int [] nums , int max,int k){
        int no = 1 ;
        int cs = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            cs+=nums[i];
            if(cs>max){
                cs=nums[i];
                no++;
            }
        }
        return no<=k;
    }
}