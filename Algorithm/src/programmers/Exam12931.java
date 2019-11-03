package programmers;

public class Exam12931 {
	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(1234));
	}

	public static int solution(int n) {

		String temp = n + "";

		int answer = 0;

		for (int i = 0; i < temp.length(); i++) {
			answer = answer + Integer.parseInt(temp.charAt(i) + "");
		}

		return answer;
	}
}
