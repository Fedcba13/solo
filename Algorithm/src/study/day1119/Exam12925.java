package study.day1119;

public class Exam12925 {

	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
		System.out.println(solution("+1234"));
	}

	public static int solution(String s) {
		int answer = 0;
		if (s.charAt(0) == '+') {
			answer = Integer.parseInt(s.substring(1, s.length()));
		} else if (s.charAt(0) == '-') {
			answer = Integer.parseInt(s.substring(1, s.length())) * -1;
		} else {
			answer = Integer.parseInt(s);
		}
		return answer;
	}

}
