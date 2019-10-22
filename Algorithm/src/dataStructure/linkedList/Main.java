package dataStructure.linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(8);
		linkedlist.add(7);
		linkedlist.add(6);
		linkedlist.add(9);
		java.util.LinkedList<String>  a = new java.util.LinkedList<>();

		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.print(linkedlist.getValue(i) + "   ");
		}
		linkedlist.remove();
		System.out.println();
		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.print(linkedlist.getValue(i) + "   ");
		}

	}

}
