package com.test.tree;

//数组实现树
public class ArrayTree {
    
	private Integer treeNodeArray[];
	private Integer index;
	private Integer maxSize;
	
	public ArrayTree(Integer size){
		treeNodeArray = new Integer[size];
		index = 0;
		maxSize = size;
	}
	
	public void insert(int key){
		if(index.equals(maxSize)){
			if(treeNodeArray[0] == null){
				treeNodeArray[0] = key;
			}else{
				treeNodeArray[index] = key;
			}
			index++;
		}else{
			System.out.println("full");
		}
	}
	
	public void showTree(){
		//for
	}
	
}
