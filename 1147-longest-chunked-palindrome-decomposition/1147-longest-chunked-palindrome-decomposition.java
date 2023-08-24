class Solution {
    public int longestDecomposition(String s) {
        
        int count = 0 ; 
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0 ; i< s.length() ; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(s.length()-i-1);
            s1.append(ch1);
            s2.insert(0, ch2);
            if(s1.toString().equals(s2.toString())){
                s1= new StringBuilder();
                s2 = new StringBuilder();
                count++;
            }
        }
        return count;
    }
}