package com.programmers;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/12977
 * @author lsh
 *
 */
public class Q05 {
	
    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++) {
        	for(int j = i + 1; j < nums.length - 1; j++) {
        		for(int k = j + 1; k < nums.length; k++) {
        			int sum = nums[i] + nums[j] + nums[k];
        			
        			answer++;
        			
        			for(int m = 2; m*m <= sum; m++) {
        				if(sum % m == 0) {
        					answer--;
        					break;
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		//int[] nums = {1,2,3,4};
		int[] nums = {1,2,7,6,4};
		
		int result = solution(nums);
		
		System.out.println(result);
	}
}