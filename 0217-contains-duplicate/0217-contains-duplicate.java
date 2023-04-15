class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int  el : nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        
        for(var c : map.keySet()){
            if(map.get(c)>=2){
                return true;
            }
        }
        return false;
    }
}