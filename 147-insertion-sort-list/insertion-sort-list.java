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
    public ListNode insertionSortList(ListNode head) {
       if(head==null || head.next==null) return head;
       ListNode temp = head.next;
       ListNode st = head;
       while(temp!=null){
        if(temp.val >= st.val){
            st = temp;
            temp=temp.next;
            continue;
        }
        st.next = temp.next;
        ListNode prev = null;
        ListNode t1 = head;
        while(t1!=st.next){
            if(t1.val >= temp.val) break;
            prev = t1;
            t1 = t1.next;
        }
        if(prev == null){
            temp.next = head;
            head = temp;
        }else{
            temp.next = t1;
            prev.next=temp;
        }
        temp = st.next;
       }
       return head;
 
    }
}
