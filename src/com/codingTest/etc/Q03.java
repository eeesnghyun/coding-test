package com.codingTest.etc;

import java.util.ArrayList;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/86051
 * @author lsh
 */
public class Q03 {

/**
 * 다른 사람의 풀이 bb
 * @param numbers
 * @return
 */
//	public int solution(int[] numbers) {
//        int sum = 45;
//        for (int i : numbers) {
//            sum -= i;
//        }
//        return sum;
//    }
	
	public static int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
        
        for(int i : numbers) {
        	arrayList.add(i);        	
        }
        
        for(int i = 0; i < 10; i++) {
        	if(!arrayList.contains(i)) {
        		answer = answer + i;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		//int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers = {5,8,4,0,6,7,9};
		
		int result = solution(numbers);
		
		System.out.println(result);
	}
}