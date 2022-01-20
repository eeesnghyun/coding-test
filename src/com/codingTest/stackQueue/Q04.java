package com.codingTest.stackQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42586
 * @author lsh
 * 오답노트
 * 1.작업이 같은 날 종료되는 경우를 고려하지 못함
 * int[] progresses = {5,4,5}; => 3일 이후 작업 종료
 * int[] speeds = {21,25,20};
 */
public class Q04 {

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		
        Stack<Integer> stack = new Stack<Integer>();        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        int index = 0;
        int index2 = 0;
        
        for(int i : progresses) {
        	double need = 100 - i;
        	double day  = 0;
        	
        	day = Math.ceil(need / speeds[index]);
        	
        	if(stack.empty()) {
        		stack.push((int) day);
        		arrayList.add(1);
        	} else {
        		if(stack.peek() >= day) {        			     	
        			arrayList.set(index2, arrayList.get(index2) + 1);
        		} else {
        			stack.push((int) day);
        			index2++;
        			arrayList.add(1);
        		}
        	}
        	
        	index++;
        }
        
        answer = new int[arrayList.size()];
        		
        for(int i = 0; i < arrayList.size(); i++) {
        	answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		//int[] progresses = {93, 30, 55};
		//int[] progresses = {95, 90, 99, 99, 80, 99};
		//int[] progresses = {5, 4, 5};
		int[] progresses = {96, 94};
		
		//int[] speeds = {1, 30, 5};
		//int[] speeds = {1, 1, 1, 1, 1, 1};
		//int[] speeds = {21, 25, 20};
		int[] speeds = {3, 3};
		
		int[] result = solution(progresses, speeds);
		
		System.out.println(Arrays.toString(result));
	}
}