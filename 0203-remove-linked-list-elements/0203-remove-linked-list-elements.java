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
    public ListNode removeElements(ListNode head, int val) {
         ListNode dummy = new ListNode(0);
    dummy.next = head;
    
    ListNode prev = dummy;
    
    while (prev.next != null) {
      
      // Skip consecutive nodes with value
      while (prev.next != null && prev.next.val == val) {
        prev.next = prev.next.next;
      }
      
      // Stop early if next node is null
      if (prev.next != null) {
        prev = prev.next;  
      }
    }
    
    return dummy.next;
  }
}