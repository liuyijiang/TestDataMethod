package com.test.sort;
/**
 * 插入排序算法测试  希尔排序基于插入排序
 * @author jim.liu
 *
 */
public class TestInsertSort {

	public void display(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"-");
		}
		System.out.println("\n");
	}
	
	public void sort(int[] array){
		
		//希尔排序
		int h = 1;
		while(h <=(array.length / 3)){
			h = h *3 +1;
		}//获得排序间隔基数
		
		while(h > 0){
		
		for(int i = h; i<array.length ;i++){
			int  in = i;
			int tempdata= array[in];
			while(in>0 && array[in]<array[in-1]){
				int temp = array[in];
				array[in] = array[in-1];
				array[in-1] = temp;
				in = in-1;
			}
			array[in] = tempdata;
		}
		  h = (h -1) /3;
		}
		
//插入排序
//		for(int i =1; i<array.length ;i++){
//			int  in = i;
//			int tempdata= array[in];
//			while(in>0 && array[in]<array[in-1]){
//				int temp = array[in];
//				array[in] = array[in-1];
//				array[in-1] = temp;
//				in = in-1;
//			}
//			array[in] = tempdata;
//		}
		
		
	}
	
	public static void main(String[] args) {
		int[] array = {23,45,1,33,55,22,44,56,2,3,5,6,11,13,77,8,0,12};
		TestInsertSort t = new  TestInsertSort();
		t.display(array);
		t.sort(array);
		t.display(array);
	}

}
