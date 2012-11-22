package com.test.graph;

public class Graph {
   
	private final int MAX_VERTS = 20;
	private Vertex vertexList[];//存放顶点
	private int adMat[][];//邻接矩阵
	private int nVerts;//顶点数量
	private StackG thsStack;
	
	public Graph(){
		
		vertexList = new Vertex[MAX_VERTS];
		adMat = new int[MAX_VERTS][MAX_VERTS];
		this.nVerts = 0;
		thsStack = new StackG();
	}
	
	public void addVertex(String lab){
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void addEdge(int start,int end){
		adMat[start][end] = 1;
		adMat[end][start] = 1;
	}
	
	public void display(int v){
		
		System.out.println(vertexList[v].label);
	}
	
	/**
	 * 基于邻接矩阵的深度优先收索
	 * @param v
	 * @return
	 */
	public int getUnvistitedVertex(int v){
		for(int j =0; j<nVerts;j++){
			if(adMat[v][j]==1 && vertexList[j].wasVisted == false){
				return j;
			}
		}
		return -1;
	}
	
	public void def(){
		vertexList[0].wasVisted = true;
		thsStack.push(0);
		display(0);
		while(!thsStack.isEmpty()){
			int v = this.getUnvistitedVertex(thsStack.peek());
			if(v == -1){
				thsStack.pop();
			}else{
				vertexList[v].wasVisted = true;
				display(v);
				thsStack.push(v);
			}
			
		}
		
		for(int j=0;j<nVerts;j++){
			vertexList[j].wasVisted = false;
		}
		
		
	}
	
	/**
	 * 有向无环图的拓扑排序  1 判断时候有换  并 2得到没有后继的节点
	 * @return
	 */
	public int noSuccessors()
	{
		boolean isEdge;
		for(int row = 0 ; row < nVerts ; row ++ )
		 {
			isEdge = false;
			
			for(int col = 0 ; col < nVerts ; col ++ )
			 {
				if(adMat[row][col] > 0)
				{
					isEdge = true;
					break;
				}
			}
			
			if(isEdge){
				return row;
			}
			
		}
		return -1;
		
		
	}
	
	
	
}
