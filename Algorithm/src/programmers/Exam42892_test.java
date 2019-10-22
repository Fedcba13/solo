package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam42892_test {

	static ArrayList<Integer> pre ;
	static ArrayList<Integer> post;

	public static void main(String[] args) {

		solution(new int[][] { { 5, 3 }, { 11, 5 }, { 13, 3 }, { 3, 5 }, { 6, 1 }, { 1, 3 }, { 8, 6 }, { 7, 2 },
				{ 2, 2 } });

		solution(new int[][] { { 5, 5 }, { 2, 4 }, {8, 4}, { 1, 3 }, { 9, 3 }, {7,2}	 });

	}

	public static void solution(int[][] nodeinfo) {
		
		pre = new ArrayList<>();
		post = new ArrayList<>();

		HashMap<Integer, Integer> t = new HashMap<>();

		for (int i = 0; i < nodeinfo.length; i++) {
			t.put(nodeinfo[i][0], i + 1);
		}

		for (int i = 0; i < nodeinfo.length; i++) {
			for (int j = 0; j < nodeinfo.length; j++) {
				if (nodeinfo[i][1] > nodeinfo[j][1]) {
					int[] a = nodeinfo[j];
					nodeinfo[j] = nodeinfo[i];
					nodeinfo[i] = a;
				}
			}

		}

		Tree tree = new Tree();
		for (int i = 0; i < nodeinfo.length; i++) {
			tree.addNode(nodeinfo[i][0]);
		}

		tree.preOrder(tree.root);
		tree.postOrder(tree.root);

		for (int i = 0; i < pre.size(); i++) {
			System.out.print(pre.get(i) + ",");
		}
		System.out.println();
		for (int i = 0; i < post.size(); i++) {
			System.out.print(post.get(i) + ",");
		}
		System.out.println();

	}

	public static class Node {

		private int value;
		private Node left;
		private Node right;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}

	public static class Tree {

		public Node root;

		public void addNode(int value) {

			if (root == null) {

				Node node = new Node();

				node.setValue(value);

				root = node; // root에 값이 없으면, root에 값을 넣는다.

			} else {

				// root가 존재할 경우, root 변경하기 위한 메소드 호출

				addNode(value, root);

			}

		}

		public void addNode(int value, Node root) {

			if (value <= root.getValue()) {

				if (root.getLeft() == null) {

					Node node = new Node();

					node.setValue(value);

					root.setLeft(node);

				} else {

					addNode(value, root.getLeft());

				}

			} else {

				if (root.getRight() == null) {

					Node node = new Node();

					node.setValue(value);

					root.setRight(node);

				} else {

					addNode(value, root.getRight());

				}

			}

		}

		public void preOrder(Node root) {

			if (root == null)

				return;

			pre.add(root.getValue());

			preOrder(root.getLeft());

			preOrder(root.getRight());

		}

		public void postOrder(Node root) {

			if (root == null)

				return;

			postOrder(root.getLeft());

			postOrder(root.getRight());

			post.add(root.getValue());

		}

	}

}
