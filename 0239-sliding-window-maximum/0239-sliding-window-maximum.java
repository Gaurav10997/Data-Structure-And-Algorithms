class Solution {
    
    public void addTodeque(LinkedList<Integer> dq ,int [] nums , int i  ){
        while(dq.size() > 0 && nums[dq.peekLast()]<nums[i])dq.removeLast();
        dq.addLast(i);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> dq = new LinkedList<>();
        for(int i = 0 ; i< k ; i++){
            addTodeque(dq,nums,i);
        }
        
        int [] ans = new int [nums.length-k+1];
        
        ans[0] = nums[dq.peek()];
        int l = 1 ; 
        int r = k ; 
        int window = 1;
        
        while(r<nums.length){
            addTodeque(dq , nums , r);
            while(dq.peek()<l)dq.remove();
            
            ans[window] = nums[dq.peek()];
            
            window++;
            l++;
            r++;
            
            
        }
        return ans;
    }
}