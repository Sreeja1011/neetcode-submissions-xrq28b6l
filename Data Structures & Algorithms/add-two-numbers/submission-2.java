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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNdoe x=l1;
        // ListNode y=l2;
        ListNode temp=new ListNode(0);
        ListNode res=temp;
        int digi=0;
        while(l1!=null&&l2!=null){
            int a=l1.val;
            int b=l2.val;
            int sum=a+b+digi;
            if(sum<10){
                digi=0;
                temp.next=new ListNode(sum);
            }
            else{
                digi=sum%10;
                sum=sum-digi;
                temp.next=new ListNode(digi);
                //temp=temp.next;
                //temp.next=new ListNode(sum);
                digi=sum/10;

            }
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int a=l1.val;
            int sum=a+digi;
            if(sum<10){
                digi=0;
                temp.next=new ListNode(sum);
            }
            else{
                digi=sum%10;
                sum=sum-digi;
                temp.next=new ListNode(digi);
                //temp=temp.next;
                //temp.next=new ListNode(sum);
                digi=sum/10;

            }
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            int a=l2.val;
            int sum=a+digi;
            if(sum<10){
                digi=0;
                temp.next=new ListNode(sum);
            }
            else{
                digi=sum%10;
                sum=sum-digi;
                temp.next=new ListNode(digi);
                digi=sum/10;

            }
            temp=temp.next;
            l2=l2.next;
        }
        if(digi>0){
            temp.next=new ListNode(digi);
        }
        return res.next;
    }
}
