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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode prev = null;
        int i = 0;
        while(cur != null){
            i++;            
            cur = cur.next;
        }

        cur = head;
        n = i - n +1;
        prev = null;
        i = 1;
        while(cur != null){
            if(i == n){
                if(prev == null){
                    head = cur.next;
                }else
                prev.next = cur.next;
            }else
            prev = cur;
            cur = cur.next;
            i++;
        }
        
        return head;
    }
}
