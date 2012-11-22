package com.test.select;

import java.util.List;

/**
 * 二分查找实现
 * @author jim.liu
 *
 */
public class ErfenSelect {
   
	 public static boolean parmIsInList(List<Integer> ids,Integer id){
    	 int low; //最低
         int high; //最高
         int mid; //中间
         boolean pramIsIn = false;
         if(ids != null && !ids.isEmpty()){
        	 low = 0;
        	 high = ids.size() - 1;
        	 while(low <= high){
        		 mid = (low + high) / 2;//获得中间位置
        		 Integer compremId = ids.get(mid); //得到被比较的id
        		 if(id < compremId){
        			 high = mid - 1;
        		 }else if(id > compremId){
        			 low = mid + 1;
        		 }else if(id.equals(compremId)){
        			 pramIsIn =  true;
        			 break;//跳出循环
        		 }
        	  }
        	 return pramIsIn;
         }else{
        	 return pramIsIn;
         }
     } 
	
}
