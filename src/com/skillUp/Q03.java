package com.skillUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/12981
 * @author user
 * 오답노트
 * 1.String 형태로 문자열을 합쳐 비교했으나 테스트20에서 성공하지 못함
 * 2.List 타입으로 바꿔 해결
 */
public class Q03 {

	public static int[] solution(int n, String[] words) {
		int[] answer = {0, 0};
       
		int index = 1;
		int order = 1;
		boolean retire = false;
		
		List<String> list = new ArrayList<String>();
		
        for(String word : words) {
        	if(list.size() > 0) {
        		char first = word.charAt(0);
        		char last  = list.get(list.size()-1).charAt(list.get(list.size()-1).length()-1);
        		
        		if(list.contains(word)) {
        			retire = true;
            	} else if(first != last) {
            		retire = true;
            	} else {
            		retire = false;
            	}
        	}    	
        	
        	if(retire) {
        		answer[0] = index;
        		answer[1] = order;
                break;
        	}        	        	                	   
        	    
        	list.add(word);   	
        	        	    	
        	if(index == n) {
        		index = 1;
        		order++;
        	} else {
        		index++;	
        	}        		
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		//int n = 3;
		int n = 2;
		
		//String[] word = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		//String[] word = {"hello", "one", "even", "never", "now", "world", "draw"};
		String[] word = {"aa", "abc", "aa", "ab"};
		
		int[] result = solution(n, word);
		
		System.out.println(Arrays.toString(result));
	}

}