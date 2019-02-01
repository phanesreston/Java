import java.util.* 
import java.util.streams.*

/*
  Given a singly-linked list, write a method to delete the first node of the list and return the new head.
*/

public ListNode deleteAtHead(ListNode head) {
    if (head == null) {
        return null;
    } else {
        head = head.next;
        return head;
    }
}
