package com.codingTest;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42587
 * @author lsh
 */
public class Q09 {

	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
        	pQueue.add(priorities[i]);
		}
    
        while (true) {        	
        	for (int i = 0; i < priorities.length; i++) {
        		if (priorities[i] == pQueue.peek()) {
        			pQueue.poll();	//값 반환,제거
        			answer++;

            		if (i == location) {
            			return answer;
            		}
        		}        		
        	}
        	
        	if (pQueue.isEmpty()) {
        		break;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		//int[] priorities = {1, 1, 9, 1, 1, 1};
		
		int location = 2;
		//int location = 0;
		
		int result = solution(priorities, location);
		
		System.out.println(result);
	}

}
