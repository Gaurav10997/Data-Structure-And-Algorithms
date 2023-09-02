class Solution {
    int res = Integer.MAX_VALUE;
    public int minExtraChar(String s, String[] dictionary) {
        HashSet<String> set = new HashSet<>();
        for(var key : dictionary){
            set.add(key);
        }
        HashMap<Integer,Integer> dp = new HashMap<>();
        
        return dfs(0,s,set,dp);
    }
    
    public int dfs (int i,String s, HashSet<String> words, HashMap<Integer,Integer> dp ){
        if(i==s.length()) return 0;
        if(dp.containsKey(i))return dp.get(i);
        res=1+dfs(i+1,s,words,dp);
        for(int j = i ; j<s.length() ; j++){
            if(words.contains(s.substring(i,j+1))){
                res = Math.min(dfs(j+1,s,words,dp),res);
            }
        }
        dp.put(i,res);
        return res;
    }
}
