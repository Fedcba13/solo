package programmers;

public class Exam12930 {

	public static void main(String[] args) {
		System.out.println((int) 'a');
		System.out.println((int) 'A');
		System.out.println(solution("try hello world"));
		System.out.println(solution("TRY HELLO WORLD"));
	}

	public static String solution(String s) {
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

}
