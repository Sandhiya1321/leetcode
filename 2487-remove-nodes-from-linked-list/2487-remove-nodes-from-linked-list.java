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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode dum=new ListNode(0);
        ListNode cur=head;
        ListNode tail=dum;                                                   
        int max=Integer.MIN_VALUE;
        while(cur!=null){
            if(cur.val>=max){
                max=cur.val;
                tail.next=cur;
                tail=tail.next;
            }
            cur=cur.next;
        }
        tail.next=null;
        return reverse(dum.next);
    }
    public ListNode reverse(ListNode head) {
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