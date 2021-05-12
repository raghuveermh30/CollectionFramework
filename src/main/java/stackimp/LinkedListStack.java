package stackimp;

public class LinkedListStack {

	Node head;

	class Node {
		int value;
		Node nextValue;
	}

	LinkedListStack() {
		head = null;
	}

	// push : add value to the begining of of the List
	public void push(int element) {
		Node extraHead = head;
		head = new Node();
		head.value = element;
		head.nextValue = extraHead;
	}

	// pop :

	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty");
		}

		int value = head.value;
		head = head.nextValue;
		return value;
	}

	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.nextValue;
		}

	}

	public static void main(String args[]) {
		LinkedListStack lls = new LinkedListStack();
		// System.out.println(lls.pop());

		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(40);
		lls.push(50);

		System.out.println("Poped or removed element from stack : " + lls.pop());
		System.out.println("Poped or removed element from stack : " + lls.pop());

		lls.push(45);
		System.out.println("Poped or removed element from stack : " + lls.pop());

		printList(lls.head);

	}

}
