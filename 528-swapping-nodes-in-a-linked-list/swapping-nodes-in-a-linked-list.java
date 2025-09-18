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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode last=head;
        int size=0;
        while(last!=null){
            last=last.next;
            size++;
        }
        last=head;
        int lsize=size-k+1;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        for(int i=1;i<lsize;i++){
            last=last.next;
        }
        int temp=last.val;
        last.val=first.val;
        first.val=temp;

        return head;
        
        
    }
}
