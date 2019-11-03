package programmers;

public class Exam17685 {

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "go", "gone", "guild" }));
		System.out.println(solution(new String[] { "abc", "def", "ghi", "jklm" }));
		System.out.println(solution(new String[] { "word", "war", "warrior", "world" }));
		System.out.println(solution(new String[] { "aa", "bb", "cc", "dd" }));
	}

	public static int solution(String[] words) {
		int answer = 0;
		for (int i = 0; i < words.length; i++) {
			int len = 1;
			while (true) {
				int index = 0;
				if(len == words[i].length()) {
					break;
				}
				String temp = words[i].substring(0, len);
				int flag = 0;
				for (int j = index; j < words.length; j++) {
					if (i == j) {
						continue;
					}
					if (words[j].indexOf(temp) == 0) {
						flag = 1;
						index = j;
						break;
					}
				}
				if (flag == 1) {
					len = len + 1;
				} else {
					break;
				}
			}
			answer = answer + len;
		}
		return answer;
	}

}
