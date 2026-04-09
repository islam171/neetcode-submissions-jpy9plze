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
    public ListNode mergeTwoLists(ListNode item1, ListNode item2) {
        ListNode item3 = new ListNode();
        ListNode head = item3;

        while(item1 != null && item2 != null){
            if(item1.val < item2.val){
                item3.next = new ListNode(item1.val);
                item1 = item1.next;
            }else{
                item3.next = new ListNode(item2.val);
                item2 = item2.next;
            }
            item3 = item3.next;
        }
        if(item1 != null){
            item3.next = item1;
        }else{
            item3.next = item2;
        }
        return head.next;
    }
}