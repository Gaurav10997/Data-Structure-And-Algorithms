class FreqStack {

    List<Stack<Integer>> list ;
    HashMap<Integer,Integer> map ;
    public FreqStack() {
        list = new ArrayList<>();
        map=new HashMap<>();
    }
    
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        int v = map.get(val);
        
        if(v-1==list.size()){
            list.add(new Stack<Integer>());
        }
        
        list.get(v-1).add(val);
    }
    
    public int pop() {
        int freq = list.size();
        int x = list.get(freq - 1).pop();
        if (list.get(freq - 1).isEmpty()) list.remove(list.size() - 1);
        
        map.put(x, map.get(x) - 1);
        if (map.get(x) == 0) map.remove(x);
        
        return x;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */