package com.codingTest;

import java.util.PriorityQueue;

public class Test {

    public static int solution(String[] scores) {
        int answer = 0;	//합격자수
        
        //조건1. 2명 이상에게 F를 받으면 불합격
        //조건2. 1번에 해당하지 않고 2명 이상에게 A를 받으면 합격
        //조건3. 1,2번에 해당하지 않으면 점수로
        //		 A=5,B=4,C=3,D=2,E=1,F=0 최저,최고를 제외한 
        //		 나머지의 평균이 3점 이상이면 합격 미만이면 불합격
         
        PriorityQueue<Integer> priorityQueue = null;
        		
        for(int i = 0; i < scores.length; i++) {
        	priorityQueue = new PriorityQueue<>();
        	 
        	int cond1 = 0;
        	int cond2 = 0;
        	int cond3 = 0;
        	
        	char[] strArr = scores[i].toCharArray();
        	
        	for(char score : strArr) {
        		String strScore = String.valueOf(score);
        		        		        		
        		if("A".equals(strScore)) {
        			priorityQueue.add(5);
                    cond2++;
        		} else if("B".equals(strScore)) {
        			priorityQueue.add(4);
        		} else if("C".equals(strScore)) {
        			priorityQueue.add(3);
        		} else if("D".equals(strScore)) {
        			priorityQueue.add(2);
        		} else if("E".equals(strScore)) {
        			priorityQueue.add(1);
        		} else if("F".equals(strScore)) {
        			priorityQueue.add(0);
        			cond1++;        			
        		}
        	}
        	
        	if(cond1 < 2) {
        		if(cond2 >= 2) {
    				answer++;
    			} else {
    				int max   = priorityQueue.size();
    				int index = 2;
    				
    				priorityQueue.remove();
    				
    				while(!priorityQueue.isEmpty()) {    					
    					int number = priorityQueue.poll();
    					
    					if(index != max) cond3 = cond3 + number;    						
    					
                        index++;
    				}
    				
    				if((cond3 / (max-2)) >= 3) answer++;
    			}
    		}         	
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] scores = {"BCD","ABB","FEE"};
		//String[] scores = {"AAFAFA", "FEECAA", "FABBCB", "CBEDEE", "CCCCCC"};
		String[] scores = {"FAD"};
		
		int result = solution(scores);
		
		System.out.println(result);
	}

}
