class Solution {
    public int bestClosingTime(String s) {
        int n = s.length();
        int prevNo [] = new int [n];
        int prevsum = 0 ;
        for(int i = 0 ; i<n ; i++){
            if(s.charAt(i)=='N'){
                prevsum++;
            }
            prevNo[i]=prevsum;
        }
        int nextNo [] = new int [n];
        int nextsum = 0 ;
        for(int i = n-1 ; i>=0 ; i--){
            if(s.charAt(i)=='Y'){
                nextsum++;
            }
            nextNo[i]=nextsum;
        }
        int ans [] = new int [n+1];
        
        for(int i = 0 ; i< n+1 ; i++){
            int nos = i==0 ? 0 : prevNo[i-1];
            int yes = i==n?0:nextNo[i];
            ans[i]=nos+yes;
        }
        int minloss = ans[0];
        int update = 0;
        for(int i = 0 ; i< ans.length ; i++){
            if(ans[i]<minloss){
                update = i;
                minloss=ans[i];
            }
        }

        return update;
    }
}