package LinkedList;
public class Rotate {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        // Create the linked list 0->1->2->3->4
        for (int i = 1; i <= 4; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        int k = 4;
        ListNode rotatedHead = rotate(head, k);

        // Print the rotated list
        while (rotatedHead != null) {
            System.out.println(rotatedHead.val);
            rotatedHead = rotatedHead.next;
        }
    }

    public static ListNode rotate(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode curr = head;
        int length = 1;

        // Find the length of the linked list
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Connect the last node to the head to make it circular
        curr.next = head;

        // Calculate the effective rotations
        int rotations = k % length;

        // Find the new head position
        int newHeadIndex = length - rotations;

        curr = head;
        ListNode newHead = null;

        // Traverse to the new head position
        for (int i = 1; i < newHeadIndex; i++) {
            curr = curr.next;
        }

        // Set the new head and break the circular connection
        newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}
