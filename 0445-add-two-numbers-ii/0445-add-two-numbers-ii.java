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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> one =new Stack<Integer>();
        Stack<Integer> two=new Stack<Integer>();
        while(l1!=null){
            one.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            two.push(l2.val);
            l2=l2.next;
        }
        ListNode head=null;
        int carry=0;

        while(!one.isEmpty()||!two.isEmpty()||carry!=0){
            int val1=one.isEmpty()?0:one.pop();
            int val2=two.isEmpty()?0:two.pop();

            int sum=val1+val2+carry;

            carry=sum/10;
            int digit=sum%10;

            ListNode node= new ListNode(digit);
            node.next=head;
            head=node;
        }
        return head;
    }
}