class MyStack {
    Queue  <Integer> q1 ;
    Queue <Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
          System.out.println(q1);
       int ans = -1;
       while(!q1.isEmpty()){
            ans=q1.peek();
            q2.add(q1.remove());
       }
       while(q2.size()>1){
           q1.add(q2.remove());
       }
       if(!q2.isEmpty())q2.remove();
        System.out.println(q1);
       return ans;
    }
    
    public int top() {
       int ans = -1;
       while(!q1.isEmpty()){
            ans=q1.peek();
            q2.add(q1.remove());
       }
       while(!q2.isEmpty())q1.add(q2.remove());
       return ans;
    }
    
    public boolean empty() {
       return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */