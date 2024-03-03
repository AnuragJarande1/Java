class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            return head=head.next;
        }

        int i=1;
        ListNode prev=head;
        while(i<sz-n){
            i++;
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
        
    }