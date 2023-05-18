class MyHashSet {
    int [] map;
    public MyHashSet() {
        map = new int [9999999];
    }
    
    public void add(int key) {
        map[key]++;
    }
    
    public void remove(int key) {
        if(map[key]>0){
             map[key]=0;
        }
      
    }
    
    public boolean contains(int key) {
        if(map[key]>0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */