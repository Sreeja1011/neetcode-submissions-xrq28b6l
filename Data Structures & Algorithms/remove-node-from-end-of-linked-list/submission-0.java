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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=head;
        ListNode res=head;
        for(int i=0;i<n;i++){
            head=head.next;
        }
        if (head == null) {
            return res.next;
        }
        while(head!=null && head.next!=null){
            dummy=dummy.next;
            head=head.next;
        }
        if(dummy.next!=null){
        dummy.next=dummy.next.next;
        }
        return res;
    
    }
}
