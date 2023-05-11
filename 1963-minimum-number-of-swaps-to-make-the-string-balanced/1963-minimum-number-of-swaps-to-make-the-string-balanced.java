class Solution {
    public int minSwaps(String brackets) {
        // Stack<Character> st = new Stack<>();
        // int mismatch = 0;
        // for(int i = 0 ; i< s.length() ; i++){
        //     if(s.charAt(i) == '[' ){
        //         st.push(']');
        //     }else{
        //         if(!st.isEmpty()){
        //             st.pop();
        //         }else{
        //             mismatch++;
        //         }
        //     }
        // }
        // return (mismatch+1)/2;
        int size = 0 ; 

		for(int i = 0 ; i< brackets.length() ; i++){
			if(brackets.charAt(i)=='['){
				size++;
			}else{
				if(size>0){
					size--;
				}
			}
		}
		return (size+1)/2;
    }
}