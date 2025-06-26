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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0){
            return null;
        }
        ListNode head=new ListNode(0);
        ListNode ans=head;
        List<Integer> list=new ArrayList<>();
        for(ListNode ls:lists){
            while(ls!=null){
            list.add(ls.val);
            ls=ls.next;
            }
        }
        Collections.sort(list);
        for(int val:list){
        ans.next=new ListNode(val);
        ans=ans.next;
        }
        return head.next;
    }
   
}