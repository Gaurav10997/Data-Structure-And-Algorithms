/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        int size = getSize(head);
        int first = 0 ;  
        int last = 0 ;
        if(k<size-k+1){
            first = k ; 
            last=size-k+1;
        }
        if(k>size-k+1){
            first = size-k+1 ; 
            last=k;
        }
        if(k==size-k+1) return head;
        int Nodeno = 0 ; 
        ListNode curr = head ;
         int temp = 0 ;
        int temp2 = 0;
         ListNode t = new ListNode(-1);
        while(curr!=null){
            Nodeno++;
            System.out.print(Nodeno + " ");
            if(Nodeno == first){
                temp = curr.val ; 
                System.out.print(temp+" ");
                t = curr;
             
            }if(Nodeno==last){
                temp2=curr.val;
                
                curr.val=temp;
                t.val= temp2;
                
            }
          curr=curr.next;
            
        }
          return head ;
    }
    public int getSize(ListNode head){
        if(head==null){
            return 0;
        }
        int size = 0 ; 
        ListNode curr = head ;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        return size;
    }
}