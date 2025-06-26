/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=len(headA);
        int l2=len(headB);
        while(l1>l2){
            l1--;
            headA=headA.next;
        }
        while(l2>l1){
            l2--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    private int len(ListNode l){
        ListNode node=l;
        int count=0;
        while(l!=null){
            count++;
            l=l.next;
        }
        return count;
    }
}