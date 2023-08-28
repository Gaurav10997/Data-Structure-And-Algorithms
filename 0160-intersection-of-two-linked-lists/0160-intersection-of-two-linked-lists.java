/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode traverseA = headA ; 
        ListNode traverseB = headB ;
        while(traverseA!=traverseB){
            if(traverseA!=null){
                traverseA = traverseA.next;
            }else{
                traverseA = headB;
            }
            if(traverseB!=null){
                traverseB = traverseB.next;
            }else{
                traverseB = headA;
            }
            
        } 
        return traverseB;

    }
}