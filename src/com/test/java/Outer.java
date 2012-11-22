package com.test.java;

public class Outer{ 
	
	static void a() 
	{ 
		Outer o = new Outer(); 
	    Inner i = o.new Inner(); 
	}
	
	Inner i = new Outer.Inner(); 
	
	public void method() { 
		new Inner(); 
	} 
	
	public class Inner{ 
		
	} 
	
	public static void main(String[] args) { 
		Outer o = new Outer(); 
		Inner i = o.new Inner(); 
	} 
	

}
