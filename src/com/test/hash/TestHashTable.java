package com.test.hash;

public class TestHashTable {
   
	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;//delete 
	
	public TestHashTable(int size){
		arraySize = size;
		hashArray = new DataItem[size];
		nonItem = new DataItem(-1);
	}
	
	private int hashFction(int key){//哈希化值到下表
		return key % arraySize;
	}
	
	
	private int hashSecondeFction(int key){
		return 5 * (key % 5);
	}
	
	
	public void insert(DataItem data){
		int hashVal = hashFction(data.getKey());
		while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){//线性探索找 到一个空位
			++hashVal;
			hashVal %= arraySize;
		}
		hashArray[hashVal] = data;
	}
	
	public boolean delete(int key){
		int hashVal = hashFction(key);//先哈希化key
		
		while(hashArray[hashVal] != null){
			
			if(hashArray[hashVal].getKey()  == key){
				hashArray[hashVal] = nonItem;
				return true;
			}else{
				++hashVal;
				hashVal %= arraySize;
			}
		}
		return false;
	}
	
	public DataItem get(int key){
		int hashVal = hashFction(key);//先哈希化key
		
		while(hashArray[hashVal] != null){
			
			if(hashArray[hashVal].getKey()  == key){
				DataItem tmep = hashArray[hashVal];
				return tmep;
			}else{
				++hashVal;
				hashVal %= arraySize;
			}
		}
		return null;
	}
	
	
	
}
