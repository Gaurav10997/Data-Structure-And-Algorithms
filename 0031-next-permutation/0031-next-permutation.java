class Solution {
    public void nextPermutation(int[] nums) {
        int l = 0 ; 
        int r = 0;
        for(int i = nums.length-1 ; i>=1; i--){
            if(nums[i]>nums[i-1]){
                l=i-1;
                System.out.println(l);
                break;
            }
        }
        
        
        for(int i = nums.length-1 ; i>=0 ; i--){
            if(nums[i]>nums[l]){
                r=i;
                break;
            }
        }
        
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        
       // reverse 
        l++;
        if(l==1 && r==0){
            l=0;
        }
        r=nums.length-1;
        while(l<r){
            int tlemp = nums[l];
            nums[l] = nums[r];
            nums[r]=tlemp;
            l++;
            r--;
        }
         
        
    }
}