class Solution {
    public int[] plusOne(int[] digits) {
        int ans [] = new int [digits.length+1];
        
        ans[0]= 0;
        for(int i = 1 ; i<digits.length+1 ; i++){
            ans[i]=digits[i-1];
        }
        
        int carry = 0 ; 
        for(int i = ans.length -1 ; i>= 0 ; i--){
            if(carry+ans[i]+1<=9){
                ans[i]=carry+ans[i]+1;
                break;
            }
            ans[i] = (carry+ans[i]+1)%10;
            carry  = (carry+ans[i]+1)/10;
            
        }
        if(ans[0]==0){
             return Arrays.copyOfRange(ans, 1, ans.length);
        }   
        return ans ; 
        
    }
}
 

// 10 --> 1 
// 11 --->1
// 12 --> 1
// 13 --> 1