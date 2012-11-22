package com.test.sort;

public class TestHuaFen {
   
	
	public void display(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"-");
		}
		System.out.println("\n");
	}
	
	//
	public void huafen(int[] array,int key){
		int left = 0;
		int right = array.length - 1;
		int leftp = left;
		int rightp = right;
		while(true){
			while(true){
				if(array[leftp] <= key){
					leftp = leftp + 1;
				}else{
					break;
				}
			}
			while(true){
				if(array[rightp] > key){
					rightp = rightp - 1;
				}else{
					break;
				}
			}
			if(leftp >= rightp){
				break;
			}else{
				int temp = array[leftp];
				array[leftp] = array[rightp];
				array[rightp] = temp;
				leftp++;
				rightp--;
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {23,45,1,33,55,22,44,56,2,3,5,6,11,13,77,8,0,12};
		TestHuaFen  t = new TestHuaFen();
		t.display(array);
		t.huafen(array, 14);
		t.display(array);
	}

}
