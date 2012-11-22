package com.test.sort;
/**
 * 快速排序算法测试 o(N*logN)
 * @author jim.liu
 *
 */
public class TestFastSort {
    
	private static int[] array = {23,45,1,33,55,22,44,56,2,3,5,6,11,13,77,8,0,12};
	
//	public static void quick(int[] number) {
//	     sort(number, 0, number.length-1);
//	}
	    
//	 private static void sort(int[] number, int left, int right) {
//	        if( right < left) { 
//	           return;
//	        }else{
//	        	int pviot = array[left];
//	        	int j = getP(number,left,right,pviot);
//		        sort(number, left, j-1);   // 對左邊進行遞迴 
//		        sort(number, j+1, right);  // 對右邊進行遞迴 
//	        }
//	    }
	
//	 private static int getP(int[] number,int left,int right,int pviot){
//		 int i = left; 
//         int j = right + 1; 
//         while(true) { 
//             // 向右找 
//             while(i + 1 < number.length && number[++i] < pviot) ;  
//             // 向左找 
//             while(j -1 > -1 && number[--j] > pviot) ;  
//             if(i >= j) 
//                 break; 
//             swap(number, i, j); 
//         } 
//         swap(number, left, j); 
//         return j;
//	 }
	 
//	    private static void sort(int[] number, int left, int right) {
//	        if(left < right) { 
//	            int i = left; 
//	            int j = right + 1; 
//	            while(true) { 
//	                // 向右找 
//	                while(i + 1 < number.length && number[++i] < number[left]) ;  
//	                // 向左找 
//	                while(j -1 > -1 && number[--j] > number[left]) ;  
//	                if(i >= j) 
//	                    break; 
//	                swap(number, i, j); 
//	            } 
//	            swap(number, left, j); 
//	            sort(number, left, j-1);   // 對左邊進行遞迴 
//	            sort(number, j+1, right);  // 對右邊進行遞迴 
//	        }
//	    }
	    
//	    private static void swap(int[] number, int i, int j) {
//	        int t = number[i]; 
//	        number[i] = number[j]; 
//	        number[j] = t;
//	    }
	
	private int partitionIt(int left,int right,int pivot){
		int leftptr = left - 1  ;
		int rightptr = right;
		while(true){
			while(array[++leftptr] < pivot);
			while(rightptr > 0 && array[--rightptr] > pivot);
			if(leftptr >= rightptr)
				break;
			else
				swap(leftptr,rightptr);
			
		}
		swap(leftptr,right);
		return leftptr;
	}
	
	private void swap(int dex1,int dex2){
		int temp = array[dex1];
		array[dex1] = array[dex2];
		array[dex2] = temp;
	}
	
	public void qSort(){
		int ls = array.length - 1;
		sort(0,ls);
	}
	
	public void sort(int left,int right){
		if(right - left <= 0){
			return;
		}else{
			int pivot = array[right];
			int p = partitionIt(left,right,pivot);
			sort(left,p-1);
			sort(p+1,right);
		}
	}
	
	public void display(){
		for(int i=0 ;i<array.length;i++){
			System.out.print(array[i] + " - ");
		}
		System.out.print("\n");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		TestFastSort t = new TestFastSort();
//		t.display();
//		quick(array);
//		t.display();
		
		TestFastSort t = new TestFastSort();
		t.display();
		t.qSort();
		t.display();

	}

}
