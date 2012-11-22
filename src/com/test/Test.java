package com.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String str1 = "d";
//		String str2 = "d";
//		String str3 = "dd";
//		String str4 = "dd";
//		System.out.println(("d"+"d") == str3);
//		
//		System.out.println(str4 == str3);
//		
//		int i = 2;
//		i *= 2 + 4;
//		System.out.println(i);
//		String str = "zzzzlll,dwadda,grgd,dasdsadada,12,dadasdda,434r34,y56y56y";
//		String[] arr = str.split(",");
//		for(int i =0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
		
//		for(){
//			
//		}
		//ArrayList
		Object obj = new Object();
		System.out.println(tt());
		String str = new String();
		//str.va
		
	}
	
	private static String tt(){
		String[] strs = {"21","4","6","7","9"};
		for(String str : strs){
			System.out.println(str);
			if(str.equals("4")){
				return str;
			}
		}
		return "-1";
	}
	
	
	private static boolean tests(){
		String str = "zzzzlll,dwadda,12,dadasdda,434r34,y56y56y";
		String str2 = "199,12,34";
		String[] arr = str.split(",");
		String[] arr2 = str2.split(",");
		boolean ss = false;
		for(int i =0;i<arr.length;i++){
			for(int j =0;i<arr2.length;i++){
				 if(arr[i].equals(arr2[j])){
					 ss = true;
					 return ss;
				 }
			}
			System.out.println(arr[i]);
		}
		return ss;
	}

}
