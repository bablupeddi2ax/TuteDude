package LinkedList;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode h = head;
		for(int i = 0;i<4;i++) {
			ListNode tmp = new ListNode(i+1);
			head.next = tmp;
			head = tmp;
		}
		
		int key  = 10;
		head = h;
		boolean isFound = false;
		while(head!=null) {
			if(head.val==key) {
				isFound = true;
				break;
			}
			head = head.next;
		}
		if(isFound) {
			System.out.println("found" + key);
		}
		else {
			System.out.println("Key " + key + " not found");
		}
	}

}
