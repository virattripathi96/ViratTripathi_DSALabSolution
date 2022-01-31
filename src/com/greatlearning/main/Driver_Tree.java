package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.BalancingBracketsAlgo;

/*
 * This is a driver class for Q.1
 * Balancing brackets
 * */
public class Driver_Tree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = scanner.next();
		scanner.close();
		
		BalancingBracketsAlgo balancingBracketsAlgo = new BalancingBracketsAlgo();
		balancingBracketsAlgo.runAlgo(inputString);
	}
	
}

