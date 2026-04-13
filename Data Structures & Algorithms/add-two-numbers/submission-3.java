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
        
        int i = 1;
        int num = 0;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int next = 0; 
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + next;
            next = sum / 10;
            cur.next = new ListNode(sum % 10);
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        while(l1 != null){
            int sum = l1.val + next;
            if(sum > 9){
                next = 1;
                sum = sum - 10;
            }else
                next = 0;
            cur.next = new ListNode(sum);
            l1 = l1.next;
            cur = cur.next;
        }
        while(l2 != null){
            int sum = l2.val + next;
            if(sum > 9){
                next = 1;
                sum = sum - 10;
            }else
                next = 0;
            cur.next = new ListNode(sum);
            l2 = l2.next;
            cur = cur.next;
        }
        if(next > 0)
        cur.next = new ListNode(next);
        return head.next;


    }
}
