class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int map [] = new int [nums.length+1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i< nums.length ; i++){
            map[nums[i]]++;
        }
      
        for(int i = 0 ; i< nums.length+1 ; i++){
            if(map[i]==2){
                ans.add(i);
            }
        }
        return ans;
    }
}