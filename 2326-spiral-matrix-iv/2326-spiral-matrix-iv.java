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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=-1;
            }
        }
        int rowStart=0;
        int rowEnd=m-1;
        int colStart=0;
        int colEnd=n-1;

        while(head!=null&&rowStart<=rowEnd&&colStart<=colEnd){
            for(int i=colStart;i<=colEnd&&head!=null;i++){
                matrix[rowStart][i]=head.val;
                head=head.next;
            }
            rowStart+=1;
            for(int i=rowStart;i<=rowEnd&&head!=null;i++){
                matrix[i][colEnd]=head.val;
                head=head.next;
            }
            colEnd-=1;
            for(int i=colEnd;i>=colStart&&head!=null;i--){
                matrix[rowEnd][i]=head.val;
                head=head.next;
            }
            rowEnd-=1;
            for(int i=rowEnd;i>=rowStart&&head!=null;i--){
                matrix[i][colStart]=head.val;
                head=head.next;
            }
            colStart+=1;
        }
        return matrix;
    }
}