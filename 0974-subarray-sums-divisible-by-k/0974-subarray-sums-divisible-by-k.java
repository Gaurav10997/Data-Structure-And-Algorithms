class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixsum = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0; i< nums.length ; i++){
            prefixsum += nums[i];
            int rem = (prefixsum%k+k)%k ; 
           
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem , map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}