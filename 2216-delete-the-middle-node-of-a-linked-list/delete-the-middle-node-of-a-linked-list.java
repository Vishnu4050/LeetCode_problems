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
    public ListNode deleteMiddle(ListNode head) {
        ListNode ptr=head;
        int size=0;
        while(ptr!=null){
            ptr=ptr.next;
            size++;
        }
        ptr=head;
        int mid=size/2;
        if(size==2){
            head.next=null;
            return head;
        }
        if(mid==0){
            return null;
        }
        for(int i=1;i<mid;i++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        return head;
    }
}
