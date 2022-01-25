package com.codingTest.hash;

import java.util.Arrays;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42577
 * @author lsh
 */
public class Q02 {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
       
		Arrays.sort(phone_book);
		
		for (int i = 0; i < phone_book.length-1; i++) {
			String phone = phone_book[i];					
			String phone2 = phone_book[i+1];
								
			if (phone2.indexOf(phone) == 0) {
				return false;
			}			
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		//String[] phone_book = {"12","123","1235","567","88"};
		//String[] phone_book = {"123","456","789"};
		
		boolean result = solution(phone_book);

		System.out.println(result);
	}

}
