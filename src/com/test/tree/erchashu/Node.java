package com.test.tree.erchashu;
/**
 * tree node
 * @author jim.liu
 *
 */
public class Node {
   
	private Node left;
	private Node right;
	private Integer data;
	
	public Node(){}
	
	public Node(int data){
		this.data = data;
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

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}
	
	
	
}
