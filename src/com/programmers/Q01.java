package com.programmers;

import java.util.PriorityQueue;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42626?language=java#
 * @author lsh
 */
public class Q01 {
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
	
		for(int i = 0; i < scoville.length; i++) {
			if(scoville[i] < K) {
				priorityQueue.add(scoville[i]);			
			}
		}
		
		while(true) {
			int min1 = priorityQueue.poll();
			int min2 = priorityQueue.poll();
			int sum = min1 + (min2 * 2);
			
			answer++;
			priorityQueue.add(sum);
			
			if(priorityQueue.peek() >= K) {
				break;
			} else {
				if(priorityQueue.size() == 1) {
					answer = -1;
					break;
				}
			}			
		}
		
	    return answer;
	}
	
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		int result = solution(scoville, K);
		
		System.out.println(result);

	}
}