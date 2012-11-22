package com.test.java;

import com.test.java.TestInnserClass.Innser;

public class TestInnserClass {
   
	public interface Noss{
		
		public void r();
	}
	
	public void show(){
		Innser in = new Innser();
		in.test("jimliu");
	}
	
	public class Innser implements Noss{
		
		public Innser(){
			
		}
		
//		public static void tt(String ste){
//			System.out.println(ste);
//		}
		
		public void test(String ste){
			System.out.println(ste);
		}

		@Override
		public void r() {
			// TODO Auto-generated method stub
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			int i = 1/0;
			return ;
		}catch(Exception e){
			return;
		}finally{
			System.out.println("**************8");
		}

	}

}
