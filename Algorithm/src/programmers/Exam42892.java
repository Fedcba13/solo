package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam42892 {

	static ArrayList<Integer> pre;
	static ArrayList<Integer> post;

	public static void main(String[] args) {

		int[][] temp = solution(new int[][] { { 5, 3 }, { 11, 5 }, { 13, 3 }, { 3, 5 }, { 6, 1 }, { 1, 3 }, { 8, 6 },
				{ 7, 2 }, { 2, 2 } });

		for(int i=0; i<temp[0].length; i++) {
			System.out.print(temp[0][i] + ",");
		}
		System.out.println();
		for(int i=0; i<temp[0].length; i++) {
			System.out.print(temp[1][i]+ ",");
		}


	}

	public static int[][] solution(int[][] nodeinfo) {
		
		pre = new ArrayList<>();
		post = new ArrayList<>();

		HashMap<Integer, Integer> t = new HashMap<>();

		for (int i = 0; i < nodeinfo.length; i++) {
			t.put(nodeinfo[i][0], i + 1);
		}

		for (int i = 0; i < nodeinfo.length; i++) {
			int tmp = nodeinfo[i][1];
			for (int j = 0; j < nodeinfo.length; j++) {
				if (tmp > nodeinfo[j][1]) {
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

		int[][] answer = new int[2][nodeinfo.length];
		for (int i = 0; i < pre.size(); i++) {
			answer[0][i] = t.get(pre.get(i));
		}
		for (int i = 0; i < post.size(); i++) {
			answer[1][i] = t.get(post.get(i));
		}

		return answer;
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

				root = node; // root�� ���� ������, root�� ���� �ִ´�.

			} else {

				// root�� ������ ���, root �����ϱ� ���� �޼ҵ� ȣ��

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
