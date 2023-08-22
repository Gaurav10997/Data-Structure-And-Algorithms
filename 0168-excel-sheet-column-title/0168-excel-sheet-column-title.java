class Solution {
    public String convertToTitle(int columnNumber) {
        
        List<Integer> list = new ArrayList<>();
        helper(columnNumber,list);
        System.out.println(list);
        StringBuilder sb = new StringBuilder();
        
        for(int i = list.size()-1 ; i>=0 ; i--){
            sb.append((char)(list.get(i)+'A'- 1));
        }
        return sb.toString();
    }
    
   public void helper(int columnNumber , List<Integer> list){
        if(columnNumber<=26){
            list.add(columnNumber);
            return;
        }
        list.add(columnNumber%26==0?26:columnNumber%26);
       if(columnNumber%26==0) helper((columnNumber/26)-1 , list);
       else helper(columnNumber/26 , list);
    }
}