package com.skillUp;

/**
 * 문제 : https://programmers.co.kr/resumes/407623/skill_checks/314898/interview_view
 * @author lsh
 * 오답노트
 * 
 */
public class Q02 {

	public static String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if("Kim".equals(seoul[i])) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
	
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		
		String result = solution(seoul);

		System.out.println(result);
	}
}