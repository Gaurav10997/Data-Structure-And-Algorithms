class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        getHelper("" , 0  ,0 , n , li);
        return li;
    }
    public void getHelper(String p , int ob , int cb ,int n , List<String>li){
        if(p.length()==2*n){
            li.add(p);
            return ;
        }
        
        if(ob<n){
            getHelper(p+"(" , ob+1 , cb ,n, li);
        }if(cb<ob){
             getHelper(p+")" , ob , cb+1 , n,li);
        }
    }
}