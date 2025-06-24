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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode middle=mid(head);
        ListNode sechalf=rev(middle);
        ListNode firstHalf=head;
        while(firstHalf!=null&&sechalf!=null){
            ListNode temp=firstHalf.next;
            firstHalf.next=sechalf;
            firstHalf=temp;
            temp=sechalf.next;
            sechalf.next=firstHalf;
            sechalf=temp;
        }
        if(firstHalf!=null){
            firstHalf.next=null;
        }
    }
    private ListNode mid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode rev(ListNode n){
        ListNode cur=n;
        ListNode prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;    
     }
}