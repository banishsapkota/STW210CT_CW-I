package Week8;

public class LinkedList {
	 Node head = null;
	    Node tail = null;

	    public void addNode(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = head;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }

	    public int listSize() {
	        Node current = head;
	        int count = 0;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
	    }

	    public int get(int i) {
	        Node current = head;
	        if (listSize() != 0 && i < listSize()) {
	            for (int j = 0; j < i; j++) {
	                current = current.next;
	            }
	            return current.data;
	        } else {
	            return -1;
	        }
	    }

}
