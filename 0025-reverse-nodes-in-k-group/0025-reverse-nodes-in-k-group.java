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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0 ;
        ListNode curr = head ; 
        
        while(curr!=null && count!=k){
            curr=curr.next;
            count++;
        }
        if(count==k){
          ListNode prev = reverseKGroup(curr,k);
          head = reverse(prev,head,k);
        }
        
        return head;
        
    }
    public ListNode reverse(ListNode prev , ListNode curr , int k){
        while(k-->0){
            ListNode next = curr.next;
            curr.next=prev ;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}