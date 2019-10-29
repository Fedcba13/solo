package study.day1029;

public class Exam60057_2 {

	// https://programmers.co.kr/learn/courses/30/lessons/60057

	public static void main(String[] args) {
		System.out.println(new Exam60057_2().solution("abcbcbc")); // 5
		System.out.println(new Exam60057_2().solution("aabbaccc")); // 7
		System.out.println(new Exam60057_2().solution("ababcdcdababcdcd")); // 9
		System.out.println(new Exam60057_2().solution("abcabcdede")); // 8
		System.out.println(new Exam60057_2().solution("abcabcabcabcdededededede")); // 14
		System.out.println(new Exam60057_2().solution("xababcdcdababcdcd")); // 17
	}

	public int solution(String s) {

		int j = 1;
		int strLeng = s.length();
		while (j <= s.length() / 2) {
			String stand = "";
			String comp = "";
			int cnt = 1;
			for (int i = 0; i < s.length(); i = i + j) {
				String sub = "";
				if (i + j > s.length()) { // 문자열 길이보다 다음거까지의 길이가 긴 경우
					sub = s.substring(i, s.length());
				} else {
					sub = s.substring(i, i + j);
				}
				if (stand.equals(sub)) { // 이전 값과 같은 경우
					cnt++;
				} else { // 이전 값과 다른 경우
					if (cnt > 1 && !"".equals(stand)) {
						comp += cnt;
					}
					comp += stand;

					cnt = 1;
				}
				if (i + j>= s.length()) {// 마지막 값보다 크거나 같은 경우
					if (cnt > 1) {
						comp += cnt;
					}
					comp += sub;
				}
				stand = sub;
				System.out.print(sub);
				System.out.print(cnt + " ");
			}
			System.out.println("comp=" + comp);
			// System.out.println(maxCnt);
			if (strLeng > comp.length()) {
				strLeng = comp.length();
			}
			System.out.println(strLeng);
			j++;
		}

		return strLeng;
	}

}
