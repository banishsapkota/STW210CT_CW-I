package Queue;

public class circularQueue {
	
	int queue[]= new int[6];
	int rear;
	int front;
	int size;
	
	
	
	
	public void enqueue( int value) {
		if(!isFull()) {
			queue[rear]=value;
			rear=(rear+1)%6;
			size=size+1;
			
		}else {
			System.out.println("Queue is full");
		}
		
		
		
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			front=(front+1)%6;
			size=size-1;
			
		}else {
			System.out.println("Queue is empty");
			
		}
		
	
	}
	public boolean isEmpty() {
		return size==0;
		
		
	}
	
	public boolean isFull() {
		return size==6;
	}
	public void display() {
		System.out.println("Rear "+ rear);
		System.out.println("Front "+ front);
		System.out.println("Size "+ size);
		System.out.println("Element in queue");
		for(int i=0;i<size;i++) {
			System.out.println(queue[(front+i)%6] + "");
		}
		System.out.println("Actual Array::");
		for(int i:queue) {
			System.out.println(i +" ");
		}
	}

}
