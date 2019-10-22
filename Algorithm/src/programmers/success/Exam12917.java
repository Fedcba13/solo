package programmers.success;

public class Exam12917 {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));

	}

	public static String solution(String s) {
		StringBuilder builder = new StringBuilder(s);
		for (int i = 0; i < builder.length() - 1; i++) {
			for (int j = 0; j < builder.length() - 1 - i; j++) {
				if (builder.charAt(j) < builder.charAt(j + 1)) {
					char temp = builder.charAt(j);
					builder.setCharAt(j, builder.charAt(j + 1));
					builder.setCharAt(j + 1, temp);
				}
			}
		}
		String answer = builder+"";

		return answer;
	}

}
