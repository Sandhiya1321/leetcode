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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode ans=new ListNode();
        ListNode tail=ans;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        tail.next=(list1!=null)?list1:list2;
        return ans.next;
    }
     public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev = null;

        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }
}