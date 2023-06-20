package LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode h = head;
		for(int i = 0;i<4;i++) {
			ListNode tmp = new ListNode(i+1);
			head.next = tmp;
			head = tmp;
		}
		ListNode res = reverse(h);
		while(res!=null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
	public static  ListNode reverse(ListNode head) {
		ListNode  rev ;
		ListNode p,q,r;
		p = head;
		q = null;
		r = null;
		while(p!=null) {
			r = p;
			q = p;
			p = p.next;
			q.next = r;
		}
		
		return q;
	}

}
