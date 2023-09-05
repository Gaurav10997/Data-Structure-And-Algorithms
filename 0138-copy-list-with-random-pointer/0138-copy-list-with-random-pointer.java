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
        Node curr = head ; 
        HashMap<Node ,Node> map = new HashMap<>();
        while(curr!=null){
            map.put(curr ,new Node(curr.val));
            curr=curr.next;
        }
        
        Node t = head ; 
        while(t!=null){
            Node node = map.get(t);
            node.next = map.get(t.next);
            node.random = map.get(t.random);
            
            
            t=t.next;
        }
        return map.get(head);
    }
}