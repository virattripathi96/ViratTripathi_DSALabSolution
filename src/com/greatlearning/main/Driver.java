package com.greatlearning.main;

import com.greatlearning.service.Node;
import com.greatlearning.service.LongestPathAlgo;

/*
 * This is a driver class for Q.2
 * Longest path in binary tree
 * */
public class Driver {
	public static void main(String[] args) {
		// hard-coded input
		LongestPathAlgo longestPathAlgo = new LongestPathAlgo();
		longestPathAlgo.root = new Node(100);
		longestPathAlgo.root.left = new Node(20);
		longestPathAlgo.root.right = new Node(130);
		longestPathAlgo.root.left.left = new Node(10);
		longestPathAlgo.root.left.right = new Node(50);
		longestPathAlgo.root.right.left = new Node(110);
		longestPathAlgo.root.right.right = new Node(140);
		longestPathAlgo.root.left.left.left = new Node(5);
		
		longestPathAlgo.findLongestPath();
		longestPathAlgo.printLongestPath();
	}
}
