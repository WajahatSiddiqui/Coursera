public class StackFixedArray {
	String s[];
	int N;

	public StackFixedArray(int capacity) {
		N = capacity;
		s = new String[N];
	}

	public bool isEmpty() {
		return s.length() == 0;
	}

	public bool isFull() {
		return s.length() == N-1;
	}

	public String pop() {
		Strig item = s[N];
		s[N] = null;
		N--;
		return item;
	}

	public void push(String item) {
		if (isFull()) return;
		s[N++] = item;
	}
}