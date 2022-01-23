package com.codingTest.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42576
 * @author lsh
 */
public class Q01 {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        int index = 1;
        
        for (String paName : participant) {        	
        	if (map.get(paName) == null) {
        		map.put(paName, index);        		
        	} else {
        		map.put(paName, map.get(paName) + 1);
        	}        	        	        	        	
        }	
        
        for (String coName : completion) {
        	if (map.get(coName) != null) {
        		map.put(coName, map.get(coName) - 1);
        	}
        }
        
        for (Map.Entry<String, Integer> result : map.entrySet()) {
        	if (result.getValue() == 1) {
        		answer = result.getKey();
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		 //String[] participant = {"leo", "kiki", "eden"};
		 String[] participant = {"mislav", "stanko", "mislav", "ana"};
		 
		 //String[] completion = {"eden", "kiki"};
		 String[] completion = {"stanko", "ana", "mislav"};
		 
		 String result = solution(participant, completion);
		 
		 System.out.println(result);
	}

}
