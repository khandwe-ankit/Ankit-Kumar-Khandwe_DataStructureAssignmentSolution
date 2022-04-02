package com.example.question2.service;

public class TreeService {
	public static Node node;
	public static Node prevNode = null;
	public static Node headNode = null;

	public static void completeBSTtoSkewed(Node root) {
		if (root == null) {
			return;
		}
		completeBSTtoSkewed(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		completeBSTtoSkewed(rightNode);
	}

	public static void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewedTree(root.right);
	}
}