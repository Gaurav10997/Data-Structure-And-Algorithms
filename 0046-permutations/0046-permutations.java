class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recursion(nums,new ArrayList<>(), ans ) ;
        return ans;
    }
    public void recursion (int [] nums , List<Integer> li , List<List<Integer>>ans ){
        if(li.size()==nums.length){
            ans.add(new ArrayList<>(li));
            return ;
        }
        
        for(int i = 0 ; i< nums.length ; i++){
            if(li.contains(nums[i]))continue;
            li.add(nums[i]);
            recursion(nums,li,ans);
            li.remove(li.size()-1);
        }
    }
}