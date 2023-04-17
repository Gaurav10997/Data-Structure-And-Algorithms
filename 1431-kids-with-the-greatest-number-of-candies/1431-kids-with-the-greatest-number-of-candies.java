class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> bool = new ArrayList<>();
        
        for(int el : candies){
            if(check(el ,candies, extraCandies)){
                bool.add(true);
            }else{
                bool.add(false);
            }
        }
        return bool;
    }
    
    public boolean check(int el , int[] candies, int extraCandies){
        int ans = el+ extraCandies;
        for(int a : candies){
            if(ans<a ){
                return false;
            }
        }
     
           return true;
       
    }
}