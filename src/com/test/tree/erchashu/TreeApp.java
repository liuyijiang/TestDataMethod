package com.test.tree.erchashu;
/**
 * 二叉树  有点结合了链表和 有序数组   delete没有实现 当删除的节点有2个子节点时  要找到删除节点后继 中遍序一下
 * @author jim.liu
 *
 */
public class TreeApp {
    
	private Node root;
	
	public TreeApp(){
		//root = new Node();
	}
	
	//判断是否是根节点
	public void insertData(int data){
		Node current = root;
		if(current == null){
			current = new Node(data);
			root = current;
		}else{
			insert(data,current);
		}
	}
	    
	//递归的插入
	public void insert(int data,Node current){
		if(current != null){
			if(current.getData() > data ){
				if(current.getLeft() == null){
					current.setLeft(new Node(data));
				}else{
					insert(data,current.getLeft());
				}
			} else {
				if(current.getRight() == null){
					current.setRight(new Node(data));
				}else{
					insert(data,current.getRight());
				}
			}
		}
	}
	
	
	
	
	/**
	 * 
	 */
	public void centerShow(Node current){
		if(current != null){
			if(current.getLeft() != null){
				centerShow(current.getLeft());
				System.out.println(current.getData());//去掉此次就是获得最小值
			}else{
				System.out.println(current.getData());
			}
		}
	}
	
	public void findMinData(){
		centerShow(root);
	}
	
	/**
	 * 查询一个节点
	 * @param data
	 */
	public void findData(int data){
	  Node find = null;
	  Node current = root;
	  //if(current.getData() > data){
	  findDataNode(current,data,find);
		System.out.println(find.getData());
	 // }
	}
	
	public void findDataNode(Node current,int data,Node find){

		if(current != null){
			if(current.getData() > data){
				findDataNode(current.getLeft(),data,find);
		   	}else if(current.getData() < data){
		   		findDataNode(current.getRight(),data,find);
		   	}else{
		   		find = current;
		   		return;
		   		//System.out.println(n.getData());
		   	}
		}
	   	
	}
	
	/**
	 * 前编序
	 */
	public void qibianxu(){
		
	}
	
	public void iter(){
		//中便序
		zhongbianxu(root);
	}
	
	/**
	 * 中遍序
	 */
	public void zhongbianxu(Node node){
		if(node == null){
			return;
		}else{
			zhongbianxu(node.getLeft());
			System.out.print(node.getData() + " - ");
			zhongbianxu(node.getRight());
		}
	}
	
	public void delete(int i){
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {15,7,19,5,10,24};
		TreeApp t = new TreeApp();
		for(int i=0;i<array.length;i++){
			t.insertData(array[i]);
		}
		System.out.println("ok");
		//t.findData(5);
		t.iter();
		//t.findMinData();
	}

}
