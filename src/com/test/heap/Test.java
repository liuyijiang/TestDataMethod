package com.test.heap;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestHeap th = new TestHeap(10);
		int data[] = {20,30,21,27,15,16,35,9,17,10};
        for(int i=0 ;i<data.length;i++){
        	th.insert(data[i]);
        }
//        System.out.println("ok");
//        th.remove();
        System.out.println("ok");
        
        for(int i=0 ;i<data.length;i++){
        	 th.remove();
        }
        
	}
   
//	public int[] sort(){
//		int max = heapArray.length;
//		int array[] = new int[max];
//		for(int i=0;i){
//			
//		}
//	}
}
