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
    public ListNode partition(ListNode head, int x) {
        ListNode one=new ListNode(0);
        ListNode two=new ListNode(0);

        ListNode onePointer=one;
        ListNode twoPointer=two;

        while(head!=null){
            if(head.val<x){
                onePointer.next=head;
                onePointer=onePointer.next;
            }else{
                twoPointer.next=head;
                twoPointer=twoPointer.next;
            }
            head=head.next;
        }
        twoPointer.next=null;
        onePointer.next=two.next;
        return one.next;
    }
}