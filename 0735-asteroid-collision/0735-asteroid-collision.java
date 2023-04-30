class Solution {
    public int[] asteroidCollision(int[] arr) {
          Deque<Integer> stack = new ArrayDeque<>();
        
        for(int a : arr){
            if(a>0){
                stack.push(a);
            }
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(a) ){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(a);
                }
                if(stack.peek()+a ==0){
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];  
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = stack.pop();
        }
        return res;
    }
}