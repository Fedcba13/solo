package study.day1126;

public class Exam12931 {
	public static void main(String[] args) {
		System.out.println(new Exam12931().solution(123));
		System.out.println(new Exam12931().solution(987));
	}
	
	public int solution(int n) {
		int answer = 0;
		
		while(n!=0) {
			answer += n%10;
			n = n/10;
		}
		
		return answer;
	}

	public int solution2(int n) {

		String temp = n + "";

		int answer = 0;

		for (int i = 0; i < temp.length(); i++) {
			answer = answer + Integer.parseInt(temp.charAt(i) + "");
		}

		return answer;
	}
}
