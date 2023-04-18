class Solution {
    public String mergeAlternately(String word1, String word2) {
       
        int l = 0 ; 
        int r = 0 ; 
        StringBuilder sb = new StringBuilder();
        while(l<word1.length() && r<word2.length()){
           char charfirst = word1.charAt(l);
            sb.append(charfirst);
            char charsecond = word2.charAt(r);
            sb.append(charsecond);
            l++;
            r++;
        }
        while(l<word1.length()){
            char charfirst = word1.charAt(l);
            sb.append(charfirst);
            l++;
        }
         while(r<word2.length()){
            char charsecond = word2.charAt(r);
            sb.append(charsecond);
            r++;
        }
        
        return sb.toString();
        
    }
}