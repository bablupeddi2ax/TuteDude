package Queue;

import java.util.Stack;

public class QueueUsingStack {

	 private Stack<Integer> stack1;
	    private Stack<Integer> stack2;

	    public QueueUsingStack() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	    public void enqueue(int item) {
	        stack1.push(item);
	    }

	    public int dequeue() {
	        if (stack1.isEmpty() && stack2.isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }

	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        return stack2.pop();
	    }

	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }

	    public int size() {
	        return stack1.size() + stack2.size();
	    }
	


	    public static void main(String[] args) {
	        QueueUsingStack queue = new QueueUsingStack();
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        System.out.println(queue.dequeue()); // Output: 10
	        System.out.println(queue.dequeue()); // Output: 20

	        queue.enqueue(40);

	        System.out.println(queue.dequeue()); // Output: 30
	        System.out.println(queue.isEmpty()); // Output: false
	        System.out.println(queue.size());    // Output: 1
	    }

}
