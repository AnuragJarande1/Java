class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode mergell= new ListNode(-1);
        ListNode temp=mergell;

        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                temp.next=h1;
                h1=h1.next;
                temp=temp.next;
            }else{
                temp.next=h2;
                h2=h2.next;
                temp=temp.next;
            }
        }

        while(h1!=null){
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
        }

         while(h2!=null){
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
        }
       
       
        return mergell.next;
    }
}