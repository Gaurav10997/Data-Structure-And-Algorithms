/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 [1,2,3,4,5,6,7,8,9,10]        ---> k = 3 
 
 size   10/3   3+1   3  3
 
 sixe   10 %3  1 
 
 
 size     [1,2,3]
 
           3/5   = 0 
           0+1 0+1 0+1 0 0 
           
           3%5  3 

3
1
1
1

           
 
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode [] temp = new ListNode[k];
        if(head==null) return temp;
        int [] ans = new int [k];
        ListNode curr = head ; 
        int a = size(head)/k;
        for(int i = 0 ; i< ans.length ; i++){
            ans[i]=a;
        }
        int b= size(head)%k;
        System.out.println(Arrays.toString(ans));
        for(int i = 0 ; i<ans.length && b>0 ; i++){
            ans[i]++;
            b--;
        }
        System.out.println(Arrays.toString(ans));
      
        int z = 0 ;
        while(k-->0){
            int m = ans[z];
            temp[z]=head;
            while(m-->0){
                if(m==0){
                    ListNode next = head.next;
                    head.next = null;
                    head=next;
                }else{
                      head=head.next;
                }
            }
            z++;
        }
        return  temp; 
        
    }
    
    
    public int size(ListNode head){
        
        ListNode curr = head ; 
        int cnt = 0 ;
        while(curr!=null){
            cnt++;
            curr=curr.next;
        }
        return cnt ;
    }

}