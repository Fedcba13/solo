package programmers;

public class Exam42860 {

	static int answer = 0;

	public static void main(String[] args) {
		System.out.println(solution("JAAAAAAAAAAN"));
		System.out.println(solution("JEROEN"));
		System.out.println(solution("JAN"));
		System.out.println(solution("JANAB"));
	}

	public static int solution(String name) {

		int idx1 = 0;
		int idx2 = 0;
		for (int i = 1; i < name.length(); i++) {
			if (name.charAt(i) != 'A') {
				if (idx1 == 0) {
					idx1 = i;
				}
				idx2 = i;
			}
		}

		if (name.length() - idx1 < idx2) {
			answer = name.length() - idx1;
		} else {
			answer = idx2;
		}

		for (int i = 0; i < name.length(); i++) {
			sol(name.charAt(i));
		}

		return answer;
	}

	public static void sol(char tmp) {
		if (tmp == 'A') {
			return;
		}
		if (tmp - 'A' < 'Z' + 1 - tmp) {
			answer = answer + (tmp - 'A');
		} else {
			answer = answer + ('Z' + 1 - tmp);
		}
	}

}
