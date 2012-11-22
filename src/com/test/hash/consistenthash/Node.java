package com.test.hash.consistenthash;

public class Node {
  
	private String name;
    private Integer id;
	
    public Node(String name){
    	this.name = name;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
