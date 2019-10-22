package programmers;

public class Exam12983 {

	static int answer = -1;

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "ba", "na", "n", "a" }, "banana")); // 3
		System.out.println(solution(new String[] { "app", "ap", "p", "l", "e", "ple", "pp" }, "apple")); // 2
		System.out.println(solution(new String[] { "ba", "an", "nan", "ban", "n" }, "banana")); // -1
	}

	public static int solution(String[] strs, String t) {
		answer = -1;
		solution(strs, t, 0);
		return answer;
	}

	public static void solution(String[] strs, String t, int cnt) {
		if (answer != -1 && cnt >= answer) {
			return;
		}
		if (t.length() == 0) {
			if (cnt < answer || answer == -1) {
				answer = cnt;
			}
			return;
		}
		for (int i = 0; i < strs.length; i++) {
			int temp = t.indexOf(strs[i]);
			if (temp == 0) {
				String txt = t.substring(0 + strs[i].length(), t.length());

				solution(strs, txt, cnt + 1);
			}
		}
	}

}
