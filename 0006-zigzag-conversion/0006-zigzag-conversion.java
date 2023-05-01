class Solution {
    public String convert(String s, int numRows) {
       if (numRows <= 1) return s;
       StringBuilder[] sbs = new StringBuilder[numRows];
       for (int i = 0; i < sbs.length; i++) sbs[i] = new StringBuilder();
       int length = s.length() ; 
       int i = 0; 
       while(i<length){
           for(int idx = 0 ; i<length && idx < numRows ; idx++){
               sbs[idx].append(s.charAt(i++));
           }
           for(int idx = numRows-2 ; idx>=1 && i<length ; idx-- ){
                sbs[idx].append(s.charAt(i++));
           }
       }
        
       for(int k = 1 ; k<sbs.length ; k++){
           sbs[0].append(sbs[k]);
       }
        return sbs[0].toString();
    }
}