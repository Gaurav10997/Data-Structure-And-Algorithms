/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node ,Node> map = new HashMap<>();
        Node curr = head ;
        while(curr!=null){
            Node node  = new Node(curr.val);
            map.put(curr,node);
            curr=curr.next;
        }
        
       Node traverse = head ; 
        
       while(traverse!=null){
           Node node = map.get(traverse);
           node.next = map.get(traverse.next);
           node.random = map.get(traverse.random);
           traverse=traverse.next;
       }
        return map.get(head);
        
       
    }
}