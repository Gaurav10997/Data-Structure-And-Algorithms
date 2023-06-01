# Standard Algorithm
```
ListNode prev = null ;
ListNode curr = head;
ListNode next ;
while(curr!=null){
next = curr.next;
System.out.println(next);
curr.next=prev;
prev=curr;
curr=next;
}
return prev;
```