package com.greatlearning.problem2;

import java.util.Scanner;

import com.greatlearning.problem2.BinarySearchTreeService.Node;

public class BST_Driver {

	public static void main(String[] args) {
		Node root = null;
		root = BinarySearchTreeService.insert(root, 40);
		root = BinarySearchTreeService.insert(root, 20);
		root = BinarySearchTreeService.insert(root, 60);
		root = BinarySearchTreeService.insert(root, 10);
		root = BinarySearchTreeService.insert(root, 30);
		root = BinarySearchTreeService.insert(root, 50);
		root = BinarySearchTreeService.insert(root, 70);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum to find the pair from Binary Search Tree : ");
		int sum = sc.nextInt();
		BinarySearchTreeService.findPair(root, sum);
	}

}