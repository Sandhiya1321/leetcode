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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> res=new HashSet<>();

        int count=0;
        ListNode cur=head;
        for(int num:nums){
            res.add(num);
        }
        while(cur!=null){
            if(res.contains(cur.val)&& (cur.next==null||!res.contains(cur.next.val))){
                count++;
            }
            cur=cur.next;
        }
        return count;
    }
}