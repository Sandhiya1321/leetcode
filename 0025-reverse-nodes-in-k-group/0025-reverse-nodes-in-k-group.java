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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head;
        }
        ListNode cur=head;
        ListNode prev=null;
       int length=getLength(head);
       int count=length/k;
        while(count>0){
            ListNode last=prev;
            ListNode end=cur;
            ListNode next=cur.next;
            for(int i=0;cur!=null&&i<k;i++){
                cur.next=prev;
                prev=cur;
                cur=next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prev;
            }else{
                head=prev;
            }
            end.next=cur;
            prev=end;
            count--;
        }
        return head;
    }
    private int getLength(ListNode head){
        ListNode node=head;
        int length=0;
        while(node!=null){
            length++;
            node=node.next;
        }
        return length;
    }
}