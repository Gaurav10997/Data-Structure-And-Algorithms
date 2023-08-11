class Pair{
    String word; 
    int level ; 
    public Pair(String word , int level){
        this.word=word;
        this.level=level;
    }
    
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        
        Set<String> set = new HashSet<>();
        
        for(int i =  0 ; i< wordList.size() ; i++){
            set.add(wordList.get(i));
        }
        
        q.add(new Pair(beginWord,1));
        
        while(!q.isEmpty()){
            String Word = q.peek().word;
            int level = q.remove().level;
            
            if(Word.equals(endWord))return level;
            
            for(int i = 0 ; i<Word.length() ; i++){
                for(char ch = 'a' ; ch<='z' ; ch++){
                     char replacedCharArray[] = Word.toCharArray();
                     replacedCharArray[i]=ch;
                     String replacedWord = new String(replacedCharArray);
                     if(set.contains(replacedWord)){
                         set.remove(replacedWord);
                         q.add(new Pair(replacedWord,level+1));
                     }
                }
            }
        }
        return 0;
    }
}