class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i<s.length() ; i++){
            if(st.size()==0) st.push(s.charAt(i));
            else if(st.size()>0 && st.peek()==s.charAt(i)){
                st.pop();
            }
            else if(st.size()>0 && st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
           while(!st.isEmpty()){
             ans.append(st.pop());
           }
         
        
        return ans.reverse().toString();
    }
}