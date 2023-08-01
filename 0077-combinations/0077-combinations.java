class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        recursion(n , k, ans , new ArrayList<Integer>(),1);
        return ans;
    }
     
    public void recursion(int n , int k ,   List<List<Integer>> ans , List<Integer> li,int start){
        
        if(k==li.size()){
            ans.add(new ArrayList<>(li));
            return ;
        }
        for(int i = start ; i<=n ; i++){
            if(li.contains(i))continue;
            li.add(i);
            recursion(n,k,ans,li,i);
            li.remove(li.size()-1);
        }
    }
}