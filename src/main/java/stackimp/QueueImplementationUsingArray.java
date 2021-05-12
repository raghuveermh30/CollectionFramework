package stackimp;

public class QueueImplementationUsingArray {
	
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;
	
	public QueueImplementationUsingArray(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int [this.capacity];
	}
	
	//for adding the Data = Enqueue = this method is use to add the element in the queue
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Hey, Queue is full, Cannot insert the data");
		}
		
		else {
			rear++;
			if(rear == capacity-1) {
				rear=0;
			}
				queueArr[rear] = data;
				currentSize++;
				System.out.println(data + " added to the queue");
			}
		}
	
	
	//for removing the element from the queue from the front of the queue = Dequeue
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Hey, queue is empty, cannot remove or delete the element from the queue");
		}	
		else {
			front++;
			if(front == capacity-1) {
				System.out.println(queueArr[front-1] +"Removed from the queue");
				front =0;
			}
			else {
				System.out.println(queueArr[front-1] +" Removed from the queue");	
			}
			currentSize--;
		}
	}
	
	
	
	public boolean isFull() {
		if(currentSize==capacity) {
			return true;
		}	
		return false;
	}
	
	public boolean isEmpty() {
		if(currentSize==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		QueueImplementationUsingArray obj = new QueueImplementationUsingArray(10);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.deQueue();
		
		obj.enqueue(40);
		obj.enqueue(50);
		obj.enqueue(60);
		obj.enqueue(70);
		obj.deQueue();
		obj.deQueue();
		
	}

}
