package Queue;

public class main {
	
	public static void main(String[] args) {
		circularQueue soft= new circularQueue();
		soft.enqueue(10);
		soft.enqueue(20);
		soft.enqueue(30);
		soft.enqueue(40);
		soft.enqueue(50);
		soft.enqueue(60);
		soft.dequeue();
		soft.display();
	}

}


