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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
         ListNode leftSide = new ListNode(-1);
         ListNode ltravese = leftSide;
         ListNode curr = head; 
         // for saving the left side only ; 
        int count = countLinkedList( head);
        int lcount = (count-(k%count));
        System.out.println(lcount);
        int left = 1;
        while(left<=lcount){
           
            ltravese.next=curr;
            curr=curr.next;
            ltravese=ltravese.next;
            left++;
        }
        ltravese.next=null;
        // for right traversal 
        
        ListNode rightSide = new ListNode(-1);
        ListNode rtravese = rightSide;
        while(curr!=null){
            System.out.println(curr.val);
            rtravese.next= curr ;
            curr=curr.next;
            rtravese=rtravese.next;
        }
        ListNode ans = new ListNode(-1);
        ListNode  a = ans;
        rightSide=rightSide.next;
        while(rightSide!=null){
            a.next=rightSide;
            rightSide= rightSide.next;
            a=a.next;
        }
        a.next=leftSide.next;
       return ans.next;
    }
    public int countLinkedList(ListNode head){
        int count = 0 ; 
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count ;
    }
}