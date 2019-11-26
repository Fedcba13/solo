package study.day1126;

public class Exam12930 {

	public static void main(String[] args) {
		System.out.println(new Exam12930().solution("try hello world"));
		System.out.println(new Exam12930().solution("TRY HELLO WORLD"));
	}

	public static String solution2(String s) {
		String answer = "";
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer = answer + ' ';
				index = 0;
			} else {
				if (index == 0) {
					if (s.charAt(i) <= 'Z') {
						answer = answer + s.charAt(i);
					} else {
						answer = answer + (char) (s.charAt(i) - 32);
					}
					index = 1;
				} else {
					if (s.charAt(i) <= 'Z') {
						answer = answer + (char) (s.charAt(i) + 32);
					} else {
						answer = answer + s.charAt(i);
					}
					index = 0;
				}
			}
		}
		return answer;
	}

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		boolean odd = true; // 홀수
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if (tmp == ' ') {
				odd = true;
			} else {
				if (odd && tmp >= 'a' && tmp <= 'z') {
					tmp -= ('a' - 'A');
				}

				if (!odd && tmp >= 'A' && tmp <= 'Z') {
					tmp += ('a' - 'A');
				}

				odd = !odd;
			}
			answer.append(tmp);
		}
		return answer + "";
	}

}
