package programmers;

import java.io.IOException;
import java.util.ArrayList;

public class Exam60058 {

	public static void main(String[] args) {

		System.out.println(new Exam60058().solution("(()())()"));
		System.out.println(new Exam60058().solution(")("));
		System.out.println(new Exam60058().solution("()))((()"));
	}

	public String solution(String p) {
		String answer = subStr(p);
		return answer;
	}

	// u / v 로 분리하는 함수
	public static String subStr(String w) {
		if (w == null || w.equals("")) {
			return "";
		}

		int cnt = 0; // 괄호 여는것 : +1 / 닫는것 : -1 => 0일때 u를 반환 / 나머지는 v
		StringBuilder u = new StringBuilder();
		StringBuilder v = new StringBuilder();

		// 분리 완료
		for (int i = 0; i < w.length(); i++) {
			if (w.charAt(i) == '(') {
				cnt++;
			} else {
				cnt--;
			}
			if (cnt == 0) {
				u.append(w.substring(0, i+1));
				v.append(w.substring(i+1, w.length()));
				break;
			}
		}

		// u가 올바른 문자열인지 확인
		if (correctString(u.toString())) {
			return u + subStr(v.toString());
		} else {
			StringBuilder sb = new StringBuilder("");
			sb.append("(");
			sb.append(subStr(v.toString()));
			sb.append(")");
			for (int i = 1; i < u.length() - 1; i++) {
				if (u.charAt(i) == '(') {
					sb.append(")");
				} else {
					sb.append("(");
				}
			}
		
			return sb.toString();
		}

	}

	public static boolean correctString(String w) {
		StringBuilder sb = new StringBuilder(w);
		for (int i = 0; i < sb.length() - 1; i++) {
			
			if (sb.charAt(i) == '(' && sb.charAt(i + 1) == ')') {
				sb.replace(i, i + 2, "");
				i = i - 2;
				if (i < -1) {
					i = -1;
				}
			}
		}
		if (sb.length() == 0) {
			return true;
		} else {
			return false;
		}
	}

}
