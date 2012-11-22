package com.test.hash;
/**
 * 哈希数据
 * @author jim.liu
 *
 */
public class DataItem {
   
	private int data;
	private int key;
	
	public DataItem(int data){
		this.data = data;
		this.key = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
	
	
}
