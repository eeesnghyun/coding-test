package com.programmers;

import java.util.Stack;

/**
 * ¹®Á¦ : https://programmers.co.kr/learn/courses/30/lessons/64061
 * @author lsh
 */
public class Q02 {
    
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();        
        
        for(int i = 0; i < moves.length; i++) {
        	int pos = moves[i];
        	
        	for(int j = 0; j < board.length; j++) {        	        		
        		int doll = board[j][pos-1];
        		
        		if(doll != 0) {
        			if(stack.empty()) {
        				stack.push(doll);
        			} else {
        				if(stack.peek() == doll) {
            				stack.pop();
            				answer = answer + 2;
            			} else {
            				stack.push(doll);	
            			}	
        			}        			
        			        			
        			board[j][pos-1] = 0;
        			break;
        		}      		        			
        	}        	        
        }                 
        
        return answer;
    }
    
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int result = solution(board, moves);
		
		System.out.println(result);
	}
}