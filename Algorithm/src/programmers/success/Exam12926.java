package programmers.success;

public class Exam12926 {
	public static void main(String[] args) {
		System.out.println(solution("Z", 2));
		System.out.println(solution("AB", 1));
		System.out.println(solution("ab", 1));
		System.out.println(solution("z", 25));
		System.out.println(solution("a B z", 4));
		System.out.println(solution("A a A a A a a A Z z z z z Z", 1));
		System.out.println((int) 'A');
		System.out.println((int) 'Z');
		System.out.println((int) '[');
	}

	public static String solution(String s, int n) {
		String answer = "";
		StringBuilder temp = new StringBuilder(s);
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ' ') {

			} else if (temp.charAt(i) <= 'Z') {
				char tmp = (char) (temp.charAt(i) + n);
				if (tmp > 'Z') {
					tmp = (char) (tmp - 26);
				}
				temp.setCharAt(i, tmp);
			} else {
				char tmp = (char) (temp.charAt(i) + n);
				if (tmp > 'z') {
					tmp = (char) (tmp - 26);
				}
				temp.setCharAt(i, tmp);
			}
		}
		answer = temp + "";
		return answer;
	}
}
