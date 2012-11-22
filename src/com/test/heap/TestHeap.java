package com.test.heap;
/**
 * 测试堆 
 * 什么是堆  1完全二叉树（没有洞）
 *        2一般是用数组实现
 *        3 每一个节点都大于或等于这个节点的子节点
 *        4 弱序
 * @author jim.liu
 *
 */
public class TestHeap {
    
	private int heapArray[];
	private int index;
	private int maxSize;
	
	public TestHeap(int size){
		heapArray = new int[size];
		index = 0;
		maxSize = size;
	}
	
	public void insert(int data){
		heapArray[index] = data;
		if(index != 0){//比较大小
			moveUp(index);
		}
		index++;
	}
	
	private void moveUp(int index){
		if(index != 0){
			int findex = (index -1 ) /2;//get father node
			if(heapArray[findex] < heapArray[index]){
				int temp = heapArray[index];
				heapArray[index] = heapArray[findex];
				heapArray[findex] = temp;
				moveUp(findex);
			}
		}
		
	}
	
	public void remove(){
		if(index != 0){
			System.out.print(heapArray[0]+" > ");
			heapArray[0] = 	heapArray[--index];
			//heapArray[index] = 0;//最后的位置kong
			moveDown(0);
		}
	}
	
	private void moveDown(int index){
		int leftChild = index * 2 + 1;
		int rightChild = index * 2 +2 ;
		if((rightChild+leftChild)< 2*maxSize){
			int currentIndex;
			
			if(heapArray[leftChild] < heapArray[rightChild]){
				currentIndex = rightChild;
			}else{
				currentIndex = leftChild;
			}
			if(heapArray[currentIndex] > heapArray[index]){
				int temp = heapArray[index];
				heapArray[index] = heapArray[currentIndex];
				heapArray[currentIndex] = temp;
				moveDown(currentIndex);
			}
		}
	}
	
	
}
