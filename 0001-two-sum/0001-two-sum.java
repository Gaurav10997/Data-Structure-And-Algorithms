class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int anss[] = {-1,-1};
        int ans = -1;
        for(int i = 0 ; i< nums.length ; i++){
           ans = target-nums[i];
            if(set.contains(ans)){
                anss[1]=i;
                break;
            }else{
                set.add(nums[i]);
            }
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==ans){
                anss[0]=i;
                break;
            }
        }
        return anss;
    }
}