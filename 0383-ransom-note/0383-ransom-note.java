class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> set = new HashMap<>();
        for(int i = 0 ; i< magazine.length() ; i++){
            set.put(magazine.charAt(i),set.getOrDefault(magazine.charAt(i),0)+1);
        }
        
        for(int i = 0 ; i<ransomNote.length() ; i++ ){
             if(!set.containsKey(ransomNote.charAt(i))) return false;
             set.put(ransomNote.charAt(i),set.getOrDefault(ransomNote.charAt(i),0)-1);
             if(set.getOrDefault(ransomNote.charAt(i),0) == 0 )set.remove(ransomNote.charAt(i));
        }
        
        return true;
    }
}