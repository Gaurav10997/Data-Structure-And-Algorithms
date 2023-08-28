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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode middle=middleNode(head);
        middle.next=middle.next.next;
        return head;
    }
     public ListNode middleNode(ListNode head) {
      ListNode slow = head ; 
      ListNode fast = head.next ; 
     while(fast.next!=null && fast.next.next!=null){
         slow=slow.next; 
         fast=fast.next.next;
     }
        
    return slow;
    }
}