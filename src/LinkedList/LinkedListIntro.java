package LinkedList;

public class LinkedListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l =new ListNode(1);
		ListNode tmp =l;
		for(int i  = 2;i<=10;i++) {
			tmp.next = new ListNode(i);
			tmp = tmp.next;
			
		}
		tmp = l;
		while(tmp!=null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}

}

class ListNode{
	int val;
	ListNode next;
	ListNode(int data){
		this.val =data;
	}
}
