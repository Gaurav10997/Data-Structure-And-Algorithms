class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0 ;
        if(s.length()<3) return 0;
        Map<Character,Integer> map = new HashMap<>();
        
        
        // fixed window         
        for(int i = 0 ; i<3 ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==3)count++;
        
        for(int i = 3 ; i<s.length() ; i++){
            char previos = s.charAt(i-3);
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
            map.put(previos , map.get(previos)-1);

            if(map.get(previos)==0) map.remove(previos);
            
            if(map.size()==3)count++;
        }
        return count ;
    }
}