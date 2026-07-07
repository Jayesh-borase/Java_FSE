package com.Day4.datastructures;

public class BinaryTree {
	
	private class Node{
		private int data;
		public Node left;
		public Node right;
		
		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

	}
	
	private Node root;
	
	public Node getRoot() {
		return this.root;
	}

	public void add(int data) {
		
		Node nn = new Node(data);
		
		if(root == null) {
			root = nn;
		}
		else {
			
			Node temp = root;
			while(true) {
				if(temp.data == data) break;
				
				if(temp.getData() > data) {
					if(temp.left == null) {
						temp.left = nn;
						break;
					}
					else {
						temp = temp.left;
					}
				}
				
				if(temp.getData() < data) {
					if(temp.right == null) {
						temp.right = nn;
						break;
					}
					else {
						temp = temp.right;
					}
				}
			}
			
		}
	}
	
	public void traverse(Node root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			traverse(root.left);
		}
		
		System.out.print(root.getData()+" ");
		
		if(root.right != null) {
			traverse(root.right);
		}
		
	}
	
}
