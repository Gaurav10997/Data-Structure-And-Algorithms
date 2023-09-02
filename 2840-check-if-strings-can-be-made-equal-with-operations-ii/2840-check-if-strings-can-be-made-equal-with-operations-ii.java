class Solution {
    public boolean checkStrings(String s1, String s2) {
        char odd [] = new char [26];
        char even [] = new char [26];
        
        for(int i = 0 ; i<s1.length() ; i++){
            if(i%2==1) {
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }else{
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            }
        }
        
        for(int i = 0 ; i< 26 ; i++){
            if(odd[i] != 0  || even[i]!=0) return false;
        }
        
        return true;
        
        
    }
}