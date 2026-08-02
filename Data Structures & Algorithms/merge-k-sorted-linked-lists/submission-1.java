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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        for(int i=1;i<lists.length;i++){
            lists[i]=merge(lists[i],lists[i-1]);
        }
        return lists[lists.length-1];
    }
    public ListNode merge(ListNode x, ListNode y){
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        while(x!=null&&y!=null){
            if(x.val<y.val){
                dummy.next=x;
                x=x.next;
            }
            else{
                dummy.next=y;
                y=y.next;
            }
            dummy=dummy.next;
        }
        if (x != null) {
            dummy.next = x;
        } else {
            dummy.next = y;
        }
        return res.next;
    }
}
