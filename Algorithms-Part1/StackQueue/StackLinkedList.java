public class StackLinkedList {
	private Node mFirst = null;
	private class Node {
		String item;
		Node next;
	}

	public boolean isEmpty() {
		return mFirst == null;
	}

	public String pop() {
		if (isEmpty()) return;
		String item = mFirst.item;
		mFirst = mFirst.next;
		return item;
	}

	public void push(String item) {
		Node node = new Node();
		node->item = item;
		node->next = mFirst;
		mFirst = node;
	}

	public String peek() {
		if (isEmpty()) return null;
		return mFirst.item;
	}
}