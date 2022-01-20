package com.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 이마트 코딩테스트
 * @author user
 *
 */
public class Test2 {

	public static int[] solution(int[] data, int d, int k) {
        int[] answer = {};                          
        int cnt = 0;
        
        List<Integer> list = new ArrayList<Integer>();        
        
        for(int i = 1; i < data.length; i++) {	             	    	
        	int num  = data[i-1];        	 
        	
        	if(i == 1) {
        		list.add(num);
        	} else {
                int next = data[i];          	
        	    int sum  = Math.abs(num - next);          
                
        		if(sum <= d && cnt <= k) {
        			cnt++;        			
        		} else {
        			list.add(num);
        			cnt = 0;
    			}
        	}
        }        
        list.add(data[data.length-1]);
        
        answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
	
	public static void main(String[] args) {
		//int[] data = {13, 15, 14, 17, 19, 18, 22, -1, -4};
		int[] data = {13,15,14,17,18,16,16};
		//int d = 3;
		int d = 2;
		//int k = 2;
		int k = 1;
		
		int[] result = solution(data, d, k);
		
		System.out.println(Arrays.toString(result));

	}

}
