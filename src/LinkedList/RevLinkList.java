package LinkedList;

public class RevLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null,tmp;
		int n = 10;
		while(n>0) {
			tmp = new ListNode(n);
			tmp.next = head;
			head = tmp;
			n--;
		}
		tmp = head;
		while(tmp!=null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
		ListNode curr,currnext,prev = null;
		curr = head;
		
		while(curr!=null) {
			currnext = curr.next;
			curr.next = prev;
			prev = curr;
			curr = currnext;
		}
		curr = prev;
		while(curr!=null) {
			System.out.println(curr.val);
			curr  = curr.next;
		}
		
		
		
	}

}
