class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans = 0 ;
        while(maxDoubles!=0  ){
            if(target==1){
                break;
            }
            if(target%2==0){
                target=target/2;
                maxDoubles--;
                ans++;
            }else{
                ans++;
                target--;
            }
            // System.out.println(target);
        }
        
        return ans+target-1;
    }
}