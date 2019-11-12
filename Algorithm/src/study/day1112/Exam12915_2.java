package study.day1112;

public class Exam12915_2 {

	public static void main(String[] args) {
		String[] answer = solution(new String[] { "abce", "abcd", "cdx" }, 2);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + "   ");
		}
		System.out.println();

		answer = solution(new String[] { "sun", "bed", "car" }, 1);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + "   ");
		}
		System.out.println();
		
		answer = solution(new String[] { "aa", "ad", "ac" }, 0);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + "   ");
		}
		System.out.println();
		
		answer = solution(new String[] { "abzcd", "cdzab", "abzfg", "abzaa", "abzbb", "bbzaa" }, 2);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + "   ");
		}
		System.out.println();
	}

	public static String[] solution(String[] strings, int n) {
		for(int i = 0; i<strings.length; i++) {
			int cnt = 0;
			for(int j=0;j<strings.length-i-1; j++) {
				if(strings[j].charAt(n) > strings[j+1].charAt(n)) {
					String temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;
					cnt++;
				}else if(strings[j].charAt(n) == strings[j+1].charAt(n)) {
					boolean change = false; // 순서를 바꿔야 하는지
					//문자열 비교
					for(int k=0; k<(strings[j].length() < strings[j+1].length() ? strings[j].length() : strings[j+1].length()); k++) {
						if(strings[j].charAt(k) > strings[j+1].charAt(k)) {
							change = true;
							break;
						}else if(strings[j].charAt(k) < strings[j+1].charAt(k)) {
							break;
						}
					}
					if(change) {
						String temp = strings[j];
						strings[j] = strings[j+1];
						strings[j+1] = temp;
						cnt++;
					}
				}
			}
			if(cnt == 0) {
				break;
			}
		}
		
		return strings;
	}

}
