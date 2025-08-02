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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode cur=head;
        int carry=0;
        while(cur!=null){
            int val=cur.val*2+carry;
            cur.val=val%10;
            carry=val/10;
            if(cur.next==null&&carry>0){
              cur.next=new ListNode(carry);
              break;
                
            }
            cur=cur.next;
        }
        return reverse(head);
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}