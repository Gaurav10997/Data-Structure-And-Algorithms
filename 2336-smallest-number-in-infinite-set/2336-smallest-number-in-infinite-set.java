class SmallestInfiniteSet {
    Queue<Integer> pq ; 
    int curr ;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        curr=1;
    }
    
    public int popSmallest() {
        int res = curr;
        if(!pq.isEmpty() && curr>pq.peek()){
            res = pq.remove();
        }
        else {
            curr++;
        }
        while(!pq.isEmpty() && pq.peek()==res){
            pq.remove();
        }
        return res;
    }
    
    public void addBack(int num) {
        pq.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */