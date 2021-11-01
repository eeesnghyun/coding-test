package com.skillUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 문제 : https://programmers.co.kr/resumes/407623/skill_checks/314898/interview_view
 * @author lsh
 * 오답노트
 * 
 */
public class Q01 {
	
	public static String[] solution(String[] strings, int n) {        
        List<String> list = new ArrayList<>();

        for(int i = 0; i < strings.length; i++) {
            String word = strings[i].charAt(n) + strings[i];
            list.add(word);            
        }

        Collections.sort(list);

        String[] answer = new String[list.size()];

        for(int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            answer[i] = word.substring(1, word.length());
        }

        return answer;
    }
  
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		String[] result = solution(strings, n);
		
		System.out.println(Arrays.toString(result));
	}
}