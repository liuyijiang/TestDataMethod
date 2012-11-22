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
public class MyHeap {
    
	private int datas[];
	private int courrentIndex;
	
	
	public MyHeap(int maxIndex){
		this.courrentIndex = 0;
		this.datas = new int[maxIndex];
	}
	
	private int getMax(){
		return datas[0];
	}
	
	/**
	 * 返回最大值
	 */
	public void showHeapData(){
		for(int i=0 ;i<datas.length;i++){
			System.out.print(datas[i] + " - ");
		}
		System.out.print("\n");
	}
	
	/**
	 * 向堆中插入值
	 * @param data
	 */
	public void insert(int data){
		if(courrentIndex < datas.length){
			datas[courrentIndex] = data;
			upmove(courrentIndex);
			courrentIndex++;
		}
	}
	
	/**
	 * 只能删除最大值 将最后的那个值放在第一位 然后开始与叶子节点比较 并交换；
	 */
	public int delete(){
		int re = 0;
		if(courrentIndex > 0){
			int last = datas[--courrentIndex];//得到最后面的一个
			re = datas[0];
			datas[0] = last;
			datas[courrentIndex] = 0;
			dowmmove(0);
		}
		return re;
	}
	
	/**
	 * 删除的时候需要移动数据 比较堆中最后那个值
	 */
	public void dowmmove(int findex){
		int left = findex * 2 + 1;//获得左右子节点 进行比较
		int right = findex * 2 + 2; 
		
		if((left + right ) < (datas.length * 2 - 1)){//注意这里要减一 数组越界
			if(datas[left] > datas[right]){
				if(datas[left] > datas[findex]){
					int temp = datas[findex];
					 datas[findex] = datas[left];
					 datas[left] = temp;
					 dowmmove(left);
				}
			}else if(datas[left] <= datas[right]){
				if(datas[right] > datas[findex]){
					int temp = datas[findex];
					 datas[findex] = datas[right];
					 datas[right] = temp;
					 dowmmove(right);
				}
			}
			
		}
		
	}
	
	//private
	
	/**
	 * 在插入的时候比较并移动节点
	 */
	public void upmove(int courrentIndex){
		if(courrentIndex > 0){
			int findex = (courrentIndex -1 ) / 2;//父节点位置
			if(datas[courrentIndex] > datas[findex]){
				 int temp = datas[findex];
				 datas[findex] = datas[courrentIndex];
				 datas[courrentIndex] = temp;
				 upmove(findex);
			}
		}
	}
	
	public static void main(String[] args){
		int d[] = {20,1,190,30,110,289,32,44,12,44,1989,34,66,78,12,3,54,333,12,1111};
		int le = d.length;
		MyHeap m = new MyHeap(le);
		for(int i =0 ; i< d.length ; i++){
			m.insert(d[i]);
		}
		m.showHeapData();
//		while(m.getMax() > 0){
//			m.delete();
//			m.showHeapData();
//		}
		
		//一下就是一个简单的堆排序
		for(int i = d.length-1;i>=0 ;i--){
			d[i] = m.delete();
		}
		for(int i =0 ; i< d.length ; i++){
			System.out.print(d[i] + " - ");
		}
		
	}
	
	
}
