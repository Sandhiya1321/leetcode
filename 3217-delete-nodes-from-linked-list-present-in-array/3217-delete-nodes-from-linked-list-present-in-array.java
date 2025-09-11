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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode prev=dum;
        ListNode cur=head;

        while(cur!=null){
            if(set.contains(cur.val)){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        return dum.next;
    }
}