/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode cur = head;
        if(cur == null || cur.next == null)
            return cur;
        ListNode pos = cur.next;
        while(pos != null){
            if(cur.val == pos.val){
                cur.next = pos.next;
                pos = pos.next;
            }
            else{
                cur = cur.next;
                pos = pos.next;
            }
        }
        return head;
    }
}