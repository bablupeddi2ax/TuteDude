package Queue;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    
    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == queue.length;
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        
        if (isEmpty()) {
            front = 0;
        }
        
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        int item = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
        
        size--;
        return item;
    }
    
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        return queue[front];
    }
}
