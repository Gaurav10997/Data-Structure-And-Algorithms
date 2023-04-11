class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack();
        String ans = "";
        String rans = "";
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                st.pop();
            }
            else{
                st.push(ch);
            }
           
        }
        
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        
        for(int i = ans.length()-1 ; i>=0 ; i--){
            rans+=ans.charAt(i);
        }
        return rans;
    }
}