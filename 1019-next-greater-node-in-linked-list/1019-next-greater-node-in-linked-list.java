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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();

        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] res=new int[list.size()];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<list.size();i++){
            while(!stack.isEmpty()&&list.get(i)>list.get(stack.peek())){
                res[stack.pop()]=list.get(i);
            }
            stack.push(i);
        }
        return res;
    }
}