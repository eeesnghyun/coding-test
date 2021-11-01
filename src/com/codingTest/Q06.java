package com.codingTest;

import java.util.Arrays;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/77484
 * @author user
 * 오답노트
 * 1. 0이없고 전부 틀린 경우
 */
public class Q06 {

	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        int min = 0;
        int max = 0;
        int match = 0;
        int temp  = 0;
        
        /**
         * 1 : 6
         * 2 : 5
         * 3 : 4
         * 4 : 3
         * 5 : 2
         * 6 : 낙첨
         */
        for(int num : lottos) {
        	if(num == 0) {
        		temp++;
        	}
        }        
        
        for(int win_num : win_nums) {
        	for(int num : lottos) {
            	if(win_num == num) {
            		match++;
            	}            	          
            }	
        }
        
        if(match == 0 && temp == 0) { 
        	max = 6;
        	min = 6;
        } else {
        	max = 7 - match - temp;
            min = 7 - match - (temp == 6 ? 1 : 0);          
        }
        
        answer = new int[]{max, min};
        
        return answer;
    }
	
	public static void main(String[] args) {
		//int[] lottos = {44, 1, 0, 0, 31, 25};
		//int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] lottos = {1, 2, 3, 4, 5, 6};
		
		//int[] win_nums = {31, 10, 45, 1, 6, 19};
		//int[] win_nums = {38, 19, 20, 40, 15, 25};
		int[] win_nums = {7, 8, 9, 10, 11, 12};
		
		int[] result = solution(lottos, win_nums);

		System.out.println(Arrays.toString(result));
	}

}
