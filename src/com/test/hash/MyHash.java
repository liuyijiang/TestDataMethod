package com.test.hash;
/**
 * 测试hash表  
 * 1要将key转化为数组下标
 * 2哈希化（压缩）
 * 3开放地址法 1：线性探测  （解决冲突问题 哈希转化过程中有冲突）
 *          2：二次探索 （聚集）
 *          3：再哈希
 *          4 删除的时候用-1代替不要有洞
 *          
 * 4链地址法         
 * @author jim.liu
 *
 */
public class MyHash {
     
	//用数组实现保存
	private DataItem[] datas = null;
	private int arraySize;//哈希表长度
	
	//是否是2倍长度
	public MyHash(int size){
		datas = new DataItem[size];
	}
	
	//将关键值哈希化 常用手法取余
	private int hashFuction(int key){
		return key % arraySize;
	}
	
	//基础hash保存
	public void insert(int data){
		//第一步哈希
		int key = hashFuction(data);
		//判断位置是否有值
		while(datas[key] == null){
			key++;
		}
		DataItem d = new DataItem(data);
		d.setKey(key);
	}
	
	
}
