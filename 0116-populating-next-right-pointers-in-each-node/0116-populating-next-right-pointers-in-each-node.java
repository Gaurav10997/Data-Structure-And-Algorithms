/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
      
        if(root==null){
            return null ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                if(size>=2){
                    Node toremove1 = q.remove();
                    Node toremove2 = q.peek();
                    toremove1.next=toremove2;
                    if(toremove1.left!=null){
                        q.add(toremove1.left);
                    }
                    if(toremove1.right!=null){
                        q.add(toremove1.right);
                    }
                }else if(size==1){
                     Node toremove1 = q.remove();
                     toremove1.next=null;
                     if(toremove1.left!=null){
                        q.add(toremove1.left);
                    }
                     if(toremove1.right!=null){
                        q.add(toremove1.right);
                    }
                }
                size--;
            }
          
        }
        return root;
    }
}