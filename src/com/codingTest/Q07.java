package com.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42888
 * @author user
 * 오답노트
 * 1.스택 클래스를 사용 -> 시간 초과
 * 2.Enter, Leave 케이스만 있는 경우 -> 결과 오류
 */
public class Q07 {

	public static String[] solution(String[] record) {
        String[] answer = {};
        String[][] results = new String[record.length][2];                               
        
        HashMap<String, String> map = new HashMap<String, String>();        
        ArrayList<String> list = new ArrayList<String>();
                
        for(int i = 0; i < record.length; i++) {
        	String[] arr  = record[i].split(" ");        
        	String action = arr[0].toLowerCase();
        	String uid    = arr[1];        	                
        	        	
        	results[i][0] = action;
        	results[i][1] = uid;        	        	
    		
        	if(arr.length > 2) {
        		map.put(uid, arr[2]);
        	}        	 		    
        }
        
        answer = new String[results.length];
         
        for(int i = 0; i < results.length; i++) {
        	String action = results[i][0];
        	String name   = map.get(results[i][1]);        	        	
        	
        	if("enter".equals(action)) {
        		list.add(name + "님이 들어왔습니다.");	
        	} else if("leave".equals(action)) {
        		list.add(name + "님이 나갔습니다.");
        	}        	        
        }
      
        answer = list.toArray(new String[list.size()]);
        
        System.out.println(Arrays.deepToString(results));

        return answer;
    }
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
						   "Leave uid1234","Enter uid1234 Prodo",
						   "Change uid4567 Ryan"};
		
		//String[] record = {"Enter uid1234 Muzi", "Leave uid1234"};
		String[] result = solution(record);
		
		System.out.println(Arrays.toString(result));
	}
}