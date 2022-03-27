
  //Definition for singly-linked list.
  class ListNode {
      int val;
     ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
     }
  }
 
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        //check if head it's null
        if(head == null || head.next == null){
            return false;
        }
        ListNode current = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
            
        }
        return false;
    }
}