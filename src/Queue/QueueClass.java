package Queue;
import java.util.*;
class ListNode{
	ListNode(int x){
		this.data = x;
	}
	int data;
	ListNode next;
}
public class QueueClass{
	public static void main(String args[]) 
	{	
		//insertion is from rear deletion is form front end
		MyQueue m = new MyQueue();
		for(int i = 0;i<5;i++)
		m.enqueue(i);
		
		m.display();
		System.out.println();
		for(int i = 0;i<5;i++) {
			
			System.out.print(m.Dequeue() );System.out.print( i!=4 ? "-<" : "");
		}
		
		
	}
}
class MyQueue{
	ListNode front,rear;
	MyQueue(){
		this.front=null;
		this.rear = null;
	}
	public  int Dequeue(){
		int x =-1;
		ListNode p;
		if(isEmpty()) {
			System.out.println("Underflow!");
		}else {
			p = front;
			front = front.next;
			x = p.data;
		}
		return x;
		
	}
	public void display() {
		ListNode p = front;
		while(p!=null) {
			System.out.print(p.data);
			p = p.next;
			if(p!=null) {
				System.out.print("<-");
			}
		}
	}
	public boolean isEmpty() {return front==null;}
	public  void enqueue(int x) {
		ListNode t =new  ListNode(x);
		if(t==null) {
			System.out.println("Underflow");
		}
		else {
			t.data= x;
			t.next=null;
			if(front==null) {
				front=t;
				rear = t;
			}
			else {
				rear.next=t;
				rear = t;
			}
		}
	}
}