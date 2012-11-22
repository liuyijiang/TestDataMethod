package com.test.sort;
/**
 * 希尔排序 思路1获得排序间隔h = h*3 +1 h初始值是1 h 小于排序数组的3分之一
 * @author jim.liu
 *
 */
public class TestShellSort {
    
	public static void main(String[] args){
		int[] array = {23,45,1,33,55,22,44,56,2,3,5,6,11,13,77,8,0,12};
		TestShellSort t = new TestShellSort();
		t.display(array);
		t.sort(array);
		t.display(array);
	}
	
	public void display(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"-");
		}
		System.out.println("\n");
	}
	
	public void sort(int[] array){
		
		int out,in;
		int h = 1;
		while(h<=(array.length / 3)){
			h = h *3 +1;
		}//获得排序间隔基数
		//开始排序
		while(h > 0){
			
			for(out = h; out<array.length; out++){
			   int temp = array[out];
				in = out;
			   while(in > h-1 && array[in-h] >= temp){
				   array[in] = array[in- h];
				   in -=h;
			   }
				array[in] = temp;
			}
			  h = (h -1) /3;
			
		}
		
	}
	
}
