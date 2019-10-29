package study.day1029;

public class Exam60057 {
	
	//https://programmers.co.kr/learn/courses/30/lessons/60057
	
	public static void main(String[] args) {
		System.out.println(new Exam60057().solution("aabbaccc")); // 7
		System.out.println(new Exam60057().solution("ababcdcdababcdcd")); // 9
		System.out.println(new Exam60057().solution("abcabcdede")); // 8
		System.out.println(new Exam60057().solution("abcabcabcabcdededededede")); // 14
		System.out.println(new Exam60057().solution("xababcdcdababcdcd")); // 17
	}
	
	public int solution(String s) {
        String answerStr = s;
        
        //i : 자를 단위 i가 4인경우, 4개의 문자 단위로 자름.
        for(int i=1; i<=s.length()/2; i++) {
        	if(answerStr.length() <= i){
        		break;
        	}
        	int curSize = (int) Math.ceil(s.length() *1.0 / i);
        	String[] curArr = new String[curSize];
        	for(int j=0; j<curArr.length; j++) { // 값 대입
        		if(j == curArr.length-1) {
        			curArr[j] = s.substring(i*j);
        		}else {
        			curArr[j] = s.substring(i*j, i*(j+1));
        		}
        		//0 3 / 3 6 / 6 9
        	}
        	
        	//문자열 압축
        	//압축된 문자
        	StringBuilder sb = new StringBuilder("");
        	for(int j=0; j<curArr.length; j++) {
        		int duplicateCnt = 1;  // 압축된 숫자
        		if(curArr[j] == null) {
        			
        		}else if(j == curArr.length - 1){
        			sb.append(curArr[j]);
        		}else {
        			for(int k=j+1; k<curArr.length; k++) {
        				if(curArr[j].equals(curArr[k])) {
        					curArr[k] = null;
        					duplicateCnt++;
        					if(k == curArr.length - 1) {
            					if(duplicateCnt != 1) {
            						sb.append(duplicateCnt);
            					}
            					sb.append(curArr[j]);
            					break;
            				}
        				}else {
        					if(duplicateCnt != 1) {
        						sb.append(duplicateCnt);
        					}
        					sb.append(curArr[j]);
        					break;
        				}
        				
        			}
        		}
        	}//압축 끝
        	
        	if(answerStr.length() > sb.length()) {
        		answerStr = sb.toString();
        	}
        	
        }
        return answerStr.length();
    }

}
