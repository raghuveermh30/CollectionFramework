package stackimp;

public class StackImp {

	int size;
	int arr[];
	int top;

	StackImp(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	// The time complexity of all the operation is O(n)
	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed element is : " + element);
		}

		else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Poped element is : " + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}

	public int peek() {
		if (!this.isEmpty()) {
			return arr[top];
		}

		else {
			System.out.println("Stack is empty");
			return -1;
		}

	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String args[]) {

		StackImp stackImp = new StackImp(10);
		stackImp.pop();

		stackImp.push(100);
		stackImp.push(200);
		stackImp.push(300);
		stackImp.push(400);

		System.out.println("*************");
		System.out.println("Peek element is : " + stackImp.peek());

		stackImp.pop();
		stackImp.pop();

		System.out.println(stackImp.isEmpty());
		System.out.println(stackImp.isFull());
	}

}
