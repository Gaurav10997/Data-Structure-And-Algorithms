class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i = 0 ; i< numRows ; i++){
            li.add(new ArrayList<>());
        }
        
        li.get(0).add(1);
        
        for(int i = 1 ; i< numRows ; i++){
            li.get(i).add(1);
            for(int j= 0 ; j<i-1 ; j++){
                li.get(i).add(li.get(i-1).get(j) + li.get(i-1).get(j+1));
            }
            
            li.get(i).add(1);
        }
        
        return li;
    }
}