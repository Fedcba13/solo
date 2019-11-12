package study.day1112;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Exam12915_3_lambda {

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
		Stream<String> stream = Arrays.stream(strings);
		
		Comparator<String> comp = (p1, p2) -> {
			int compare = Character.compare(p1.charAt(n), p2.charAt(n)); 
			if(compare == 0) {
				compare = p1.compareTo(p2);
			}
			return compare;
		};
		
		strings = stream.sorted(comp).toArray(String[]::new);
		
		return strings;
	}

}
