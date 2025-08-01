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
    public int pairSum(ListNode head) {
        int twin=0;
        Stack<Integer> left=new Stack<>();
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
           left.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
            
            
        }
       
        while(slow!=null&&!left.isEmpty()){
           
            int prev=left.pop();
            twin=Math.max(twin,slow.val+prev); 
            slow=slow.next;
            
        }
        return twin;
    }
}