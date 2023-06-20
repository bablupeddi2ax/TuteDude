package LinkedList;

public class CountingNodes {

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
		int count = 0;
		int sum = 0;
		while(head!=null) {
			count++;
			sum = sum + head.val;
			head = head.next;
			
		}
		System.out.println(count + " " +sum);
	}

}
