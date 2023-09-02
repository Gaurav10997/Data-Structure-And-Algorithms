class SummaryRanges {
    private Set<Integer> set ; 
    public SummaryRanges() {
        set=new TreeSet<>();
    }
    
    public void addNum(int value) {
        set.add(value);
    }
    
    public int[][] getIntervals() {
        List<int[]> res = new ArrayList<>();
        for(int n : set){
            int size = res.size();
            if(size>0  && res.get(size-1)[1]+1 ==n ){
                res.get(size-1)[1] = n ;
            }else{
                res.add(new int[]{n,n});
            }
        }
        return res.toArray(new int[0][]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */