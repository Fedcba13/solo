package programmers.success;

public class Exam12933 {
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

	public static long solution(long n) {
		StringBuilder temp = new StringBuilder(n + "");
		for (int i = 0; i < temp.length() - 1; i++) {
			for (int j = 0; j < temp.length() - 1 - i; j++) {
				if (temp.charAt(j) < temp.charAt(j + 1)) {
					char tmp = temp.charAt(j);
					temp.setCharAt(j, temp.charAt(j+1));
					temp.setCharAt(j+1, tmp);
				}
			}
		}
		long answer = 0;
		answer = Long.parseLong(temp + "");
		return answer;
	}
}
