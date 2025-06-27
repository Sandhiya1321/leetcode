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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode left=temp;
        while(left.next!=null){
            if(left.next.val==val){
               left.next=left.next.next;
            }else{
                left=left.next;
            }
        }
        return temp.next;
    }
}