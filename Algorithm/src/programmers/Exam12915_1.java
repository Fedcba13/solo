package programmers;

public class Exam12915_1 {

	public static void main(String[] args) {
		String[] answer = solution(new String[] { "abce", "abcd", "cdx" }, 2);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		System.out.println();

		answer = solution(new String[] { "sun", "bed", "car" }, 1);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		System.out.println();
	}

	public static String[] solution(String[] strings, int n) {
		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = 0; j < strings.length - i - 1; j++) {
				if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				} else if (strings[j].charAt(n) < strings[j + 1].charAt(n)) {

				} else {
					int compare = 0;
					int index = 0;
					while (compare == 0) {
						if (index == n) {
							index++;
						} else {
							if (strings[j].charAt(index) > strings[j + 1].charAt(index)) {
								compare = 1;
							} else if (strings[j].charAt(index) < strings[j + 1].charAt(index)) {
								compare = 2;
							} else {
								index++;
							}
						}
					}
					if (compare == 1) {
						String temp = strings[j];
						strings[j] = strings[j + 1];
						strings[j + 1] = temp;
					}
				}
			}
		}
		String[] answer = strings;
		return answer;
	}

}
