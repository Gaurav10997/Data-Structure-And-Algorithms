class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int l = 0 , r = 0 ;
        while(l<=pushed.length){
            if(!st.isEmpty() && st.peek()==popped[r]){
                st.pop();
                r++;
            }
            else{
                if(l<pushed.length) st.push(pushed[l]);
                l++;
            }
        }
        return st.isEmpty();
    }
}