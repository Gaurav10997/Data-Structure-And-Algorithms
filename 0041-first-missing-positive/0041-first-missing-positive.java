class Solution {
    public int firstMissingPositive(int[] nums) {
       for(int i = 0 ; i< nums.length ; i++){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums, i , correct);
                i--;
            }
       }
           
        for (int index = 0; index<nums.length; index++){
                if (nums[index] != index+1){
                    return index+1;
                }
        }
        return nums.length+1;  
        
    }
    void swap(int[] nums , int first , int second ){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }
  
}