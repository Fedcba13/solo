package dataStructure.linkedList;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
		} else if (tail == null) {
			tail = newNode;
			head.next = newNode;
			size++;
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public void remove() {
		Node tempnode = head;
		for (int i = 0; i < size - 1; i++) {
			tempnode = tempnode.next;
		}
		size--;
		tail = tempnode;
		tempnode.next = null;
	}

	public int getValue(int count) {
		Node temp = head;
		for (int i = 0; i < count; i++) {
			temp = temp.next;
		}
		return temp.value;
	}

	public int size() {
		return size;
	}

}
