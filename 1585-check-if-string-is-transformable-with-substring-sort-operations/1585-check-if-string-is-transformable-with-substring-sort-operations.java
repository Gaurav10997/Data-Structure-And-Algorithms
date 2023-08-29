class Solution {
      public boolean isTransformable(String s, String t) {
        // return isTransformableCopied(s,t);
          return helper(s ,t);
    }
    
    public  boolean helper(String s , String t){
        List<Queue<Integer>> index = new ArrayList<>();
        
        for(int i = 0 ; i< 10 ; i++){
            index.add(new LinkedList<>());
        }
        
        for(int i = 0 ; i< s.length() ; i++){
            index.get(s.charAt(i)-'0').add(i);
        }
        
        for(int i = 0 ; i< t.length() ; i++){
            int digit = t.charAt(i) - '0';
            
            if(index.get(digit).isEmpty()) return false;
            
            for(int j = 0 ; j<digit ; j++){
                if(!index.get(j).isEmpty() &&   index.get(j).peek()<index.get(digit).peek()) return false;
            }
            
            index.get(digit).remove();
        }
        return true;
    } 
    public boolean isTransformableCopied(String s , String t){
         List<Queue<Integer>> idx = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            idx.add(new LinkedList<Integer>());
        }
        for (int i = 0; i < s.length(); ++i) {
            idx.get(s.charAt(i) - '0').offer(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            int digit = t.charAt(i) - '0';
            if (idx.get(digit).isEmpty()) {
                return false;
            }
            
            for (int j = 0; j < digit; ++j) {
                if (!idx.get(j).isEmpty() && idx.get(j).peek() < idx.get(digit).peek()) {
                    return false;
                }
            }
            idx.get(digit).poll();
        }
        return true;
    }
}