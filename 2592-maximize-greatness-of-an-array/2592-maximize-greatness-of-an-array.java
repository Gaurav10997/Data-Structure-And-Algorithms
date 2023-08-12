class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int l = 0 ;
        for(int r = 0 ; r<nums.length ; r++){
            if(nums[r]>nums[l]){
                l++;
            }
        }
        
        return l ;
    }
}