package com.test.hash.consistenthash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class HashAlgorithmTest {
  
    static Random ran = new Random();
	
	/** key's count */
	private static final Integer EXE_TIMES = 100000;
	
	private static final Integer NODE_COUNT = 5;
	
	private static final Integer VIRTUAL_NODE_COUNT = 160;
	
	public static void main(String[] args) {
		
//	}
//		HashAlgorithmTest test = new HashAlgorithmTest();
//		
//		/** Records the times of locating node*/
//		Map<Node, Integer> nodeRecord = new HashMap<Node, Integer>();
//		
//		List<Node> allNodes = test.getNodes(NODE_COUNT);
//		KetamaNodeLocator locator = new KetamaNodeLocator(allNodes, HashAlgorithm.KETAMA_HASH, VIRTUAL_NODE_COUNT);
//		
//		List<String> allKeys = test.getAllStrings();
//		for (String key : allKeys) {
//			Node node = locator.getPrimary(key);
//			
//			Integer times = nodeRecord.get(node);
//			if (times == null) {
//				nodeRecord.put(node, 1);
//			} else {
//				nodeRecord.put(node, times + 1);
//			}
//		}
		
//		System.out.println("Nodes count : " + NODE_COUNT + ", Keys count : " + EXE_TIMES + ", Normal percent : " + (float) 100 / NODE_COUNT + "%");
//		System.out.println("-------------------- boundary  ----------------------");
//		for (Map.Entry<Node, Integer> entry : nodeRecord.entrySet()) {
//			System.out.println("Node name :" + entry.getKey() + " - Times : " + entry.getValue() + " - Percent : " + (float)entry.getValue() / EXE_TIMES * 100 + "%");
//		}
		
   }
}
