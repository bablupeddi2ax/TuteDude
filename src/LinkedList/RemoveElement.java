package LinkedList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1  = null,head = null;
		for(int i = 0;i<5;i++) {
			ListNode t = new ListNode(4);
			if(l1==null) {
				l1 = t;
				head = t;
				l1.next = null;
			}
			else {
				l1.next = t;
				l1 = t;
			}
			}
		
		int target = 4;
		ListNode res = SolutionK.removeElements(head, target);
		if(res==null) {
			System.out.println("Empty list");
		}
		while(res!=null) {
			System.out.println(res.val);
			res = res.next;
		}
			
	}

}

class SolutionK {
	  public  static ListNode removeElements(ListNode head, int val) {
	    ListNode sentinel = new ListNode(0);
	    sentinel.next = head;

	    ListNode prev = sentinel, curr = head;
	    while (curr != null) { //if current node is not null
	      if (curr.val == val) prev.next = curr.next; //compare the value with the given value
	      else prev = curr; 
	      curr = curr.next;
	    }
	    return sentinel.next;
	  }
	}