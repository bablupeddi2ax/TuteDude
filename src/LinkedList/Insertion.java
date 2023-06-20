package LinkedList;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode h = head;
		for(int i = 0;i<4;i++) {
			ListNode tmp = new ListNode(i+1);
			head.next = tmp;
			head = tmp;
		}
		insertAtBeg(1,h);
		printList(h);
		insertAtEnd(1,h);
		printList(h);
		insertAtPos(1,2,h);
		printList(h);
	}
	public static void printList(ListNode head) {
		ListNode h = head;
		while(h!=null) {
			System.out.println(h.val);
			h =h.next;
		}
	}
	public static  void insertAtBeg(int ele,ListNode head) {
		if(head==null) {
			head = new ListNode(ele);
		}
		else {
			ListNode tmp = new ListNode(ele);
			tmp.next = head;
			head = tmp;
		}
	}
	public static  void insertAtEnd(int ele,ListNode head) {
		ListNode tr = head;
		ListNode tmp = new ListNode(ele);
		while(tr.next!=null) {
			tr = tr.next;
		}
		tr.next = tmp;
	}
	public static void insertAtPos(int ele,int pos,ListNode head) {
		ListNode t = head;
		while(pos>0 && t!=null) {
			t = t.next;
			pos = pos-1;
		}
		if(t!=null) {
		ListNode e = new ListNode(ele);
		e.next= t.next;
		t.next =e;
		}
	}

}
