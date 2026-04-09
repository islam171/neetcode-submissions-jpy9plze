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
    public ListNode reverseList(ListNode head) {
        ListNode item = head;
        ListNode prev = null;
        ListNode i = head;
        while(item != null){
            i = item.next;
            item.next = prev;
            prev = item;
            item = i;
        }
        return prev;
    }
}
