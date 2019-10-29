package study.day1029;

public class Exam12901_1 {
	
	//https://programmers.co.kr/learn/courses/30/lessons/12901
	
	public static void main(String[] args) {
		System.out.println(new Exam12901_1().solution(5, 24));
	}
	
	
	  public String solution(int a, int b) {
	      String answer = "";
	      int day = 0;
	      int[] date = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	      String[] t = {"THU","FRI","SAT","SUN", "MON","TUE","WED"};
	      for(int i=1; i<a;i++){
	          day = day + date[i];
	      }
	      day = day + b;
	      answer = t[day % 7];
	      return answer;
	  }

}
