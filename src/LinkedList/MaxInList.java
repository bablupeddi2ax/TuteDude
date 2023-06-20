package LinkedList;

public class MaxInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode h = head;
		for(int i = 0;i<4;i++) {
			ListNode tmp = new ListNode(i+1);
			head.next = tmp;
			head = tmp;
		}
		head = h;
		int max = Integer.MIN_VALUE;
		while(head!=null) {
			if(head.val>max) {
				max = head.val;
			}
			head = head.next;
		}
		System.out.println(max);
	}

}
