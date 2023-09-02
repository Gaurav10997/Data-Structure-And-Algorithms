class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
       
        long maxans = 0; 
        long sum = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
      
        
        for(int z = 0 ; z<k ; z++){
            map.put(nums.get(z),map.getOrDefault(nums.get(z),0)+1);
            sum+=nums.get(z);
        }
        if(map.size()>=m) maxans=Math.max(sum,maxans);

        
        
        for(int i = k ; i<nums.size() ; i++){
            sum-=nums.get(i-k);
            map.put(nums.get(i-k),map.get(nums.get(i-k))-1);
            if(map.get(nums.get(i-k))==0) map.remove(nums.get(i-k));
            sum+=nums.get(i);
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            if(map.size()>=m) maxans=Math.max(sum,maxans);
        }
        
        
        return maxans;
    }
}