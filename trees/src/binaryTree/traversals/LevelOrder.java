package binaryTree.traversals;

import binaryTree.Node;
import binaryTree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	public static void main(String[] args) {
		levelOrder(Tree.getRoot());
		System.out.println();
		levelOrder2(Tree.getRoot());

		System.out.println();

		levelOrder(Tree.getRoot2());
		System.out.println();
		levelOrder2(Tree.getRoot2());

		System.out.println();

		levelOrderPractise(Tree.getRoot2());
	}

	public static void levelOrder(Node node) {
		if (node == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.offer(node);

		while (!queue.isEmpty()) {
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				Node curr = queue.poll();
				System.out.print(curr.data + " ");

				if (curr.left != null) {
					queue.offer(curr.left);
				}

				if (curr.right != null) {
					queue.offer(curr.right);
				}
			}
			System.out.println();

		}
	}

	public static void levelOrder2(Node node) {
		if (node == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.offer(node);
		queue.offer(null);

		while (!queue.isEmpty()) {
			Node curr = queue.poll();

			if (curr == null) {
				System.out.println();
				if (!queue.isEmpty()) {
					queue.offer(null);
				}
			} else {

				System.out.print(curr.data + " ");

				if (curr.left != null) {
					queue.offer(curr.left);
				}

				if (curr.right != null) {
					queue.offer(curr.right);
				}
			}
		}
	}

	// just prints node level wise but can't know nodes of same level, for this use above methods
	public static void levelOrderPractise(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		while(!queue.isEmpty()) {
			Node poll = queue.poll();
			System.out.println(poll.data);

			if (poll.left != null) {
				queue.offer(poll.left);
			}

			if (poll.right != null) {
				queue.offer(poll.right);
			}
		}
	}
}
