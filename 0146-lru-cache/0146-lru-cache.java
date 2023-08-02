class LRUCache {
     class Node{
      Node next, prev; 
      int key,value;
      Node (int key,int value){
        this.key=key;
        this.value=value;
      }
    }
   Node head=new Node(0,0),tail =new Node(0,0);
   Map<Integer,Node> map=new HashMap<>();
   int capacity;
    public LRUCache(int _capacity) {
      head.next=tail;
      tail.prev=head;    
      capacity=_capacity;
    }
    
    public int get(int key) {
       int ans = -1;
       if(map.containsKey(key)){
         Node node=map.get(key);
         ans = node.value;
         remove(node); 
         insert(node);
       }
       return ans;
    }
    
    public void put(int key, int value) {
      if(map.containsKey(key)){
        remove(map.get(key));
      }
      if(map.size()==capacity){
        remove(tail.prev);
      }
      insert(new Node(key,value));
    }
    
    void remove(Node node){
      map.remove(node.key);
      node.prev.next=node.next;
      node.next.prev=node.prev; 
    }
    
    void insert(Node node){
      map.put(node.key,node);
      Node headnext=head.next;
      head.next=node;   
      node.prev=head;
      node.next=headnext;
      headnext.prev=node;
    }
   
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */