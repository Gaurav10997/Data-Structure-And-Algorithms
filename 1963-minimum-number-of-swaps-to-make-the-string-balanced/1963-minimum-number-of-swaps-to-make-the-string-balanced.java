class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int mismatch = 0;
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) == '[' ){
                st.push(']');
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    mismatch++;
                }
            }
        }
        return (mismatch+1)/2;
    }
}