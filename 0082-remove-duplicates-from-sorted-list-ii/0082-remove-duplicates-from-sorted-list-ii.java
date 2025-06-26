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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans=new ListNode(0,head);
        ListNode node=ans;
       while(head!=null&&head.next!=null){
        if(head.val==head.next.val){
           while(head.val==head.next.val){
           head=head.next;
           }
           node.next=head.next;
        }else{
            node=node.next;
        }
        head=head.next;
       }
       return ans.next;
    }
}