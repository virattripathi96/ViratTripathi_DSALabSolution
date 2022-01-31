package com.greatlearning.service;

public class Node {
	int data;
	public Node left, right;
	public int getData() {
		return data;
	}
	
	public Node(int value) {
		data = value;
		left = null;
		right = null;
	}
}
