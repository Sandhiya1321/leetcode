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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sHalf=rev(slow);
        ListNode fHalf=head;
        while(sHalf!=null){
            if(fHalf.val!=sHalf.val){
                return false;
            }
            fHalf=fHalf.next;
            sHalf=sHalf.next;
        }
        return true;
    }
    public ListNode rev(ListNode n){
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