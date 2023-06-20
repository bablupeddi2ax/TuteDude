package LinkedList;

public class CircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode h = head;
		for(int i = 0;i<4;i++) {
			ListNode tmp = new ListNode(i+1);
			head.next = tmp;
			head = tmp;
		}
		
		
		head.next =h;
		ListNode tmp = h;
		do {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
		while(tmp!=head);
	}

}
