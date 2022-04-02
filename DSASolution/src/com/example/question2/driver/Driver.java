package com.example.question2.driver;

import com.example.question2.service.Node;
import com.example.question2.service.TreeService;

public class Driver {
	public static void main(String[] args) {

		TreeService.node = new Node(40);
		TreeService.node.left = new Node(30);
		TreeService.node.right = new Node(60);
		TreeService.node.left.left = new Node(10);
		TreeService.node.right.left = new Node(55);

		TreeService.completeBSTtoSkewed(TreeService.node);
		System.out.println("The resultant  output is :");
		TreeService.traverseRightSkewedTree(TreeService.headNode);
	}
}
