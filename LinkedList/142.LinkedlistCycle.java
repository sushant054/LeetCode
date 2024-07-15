public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode ptr1=head;
        ListNode ptr2=head;
        while(ptr2 != null && ptr2.next != null){
            ptr2 = ptr2.next.next;
            ptr1= ptr1.next;
            if(ptr1 == ptr2){
                while(head!=ptr1){
                    head=head.next;
                    ptr1=ptr1.next;
                }
                return ptr1;

            }
        }return null;
         
    }
}