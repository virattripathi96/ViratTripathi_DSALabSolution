package com.greatlearning.service;

import java.util.ArrayList;

public class LongestPathAlgo {
	public Node root;
	ArrayList<Integer> longestPath;
	
	public void findLongestPath() {
		longestPath = findLongestPath(root);
	}
	
	private ArrayList<Integer> findLongestPath(Node node) {
		if(node == null) {
			return new ArrayList<>();
		}
		
		ArrayList<Integer> leftPath = findLongestPath(node.left);
		ArrayList<Integer> rightPath = findLongestPath(node.right);
		
		ArrayList<Integer> longestPath = leftPath.size() > rightPath.size() ? leftPath : rightPath;
		longestPath.add(node.getData());
		return longestPath;
		
	}

	public void printLongestPath() {
		// TODO Auto-generated method stub
		System.out.println("The longest path in the binary tree is:");
		
		for(int i = longestPath.size() - 1; i >= 0; i--) {
			if(i == 0) {
				System.out.print(longestPath.get(i));
			} else {
				System.out.print(longestPath.get(i) + " -> ");
			}
		}

	}
	
}