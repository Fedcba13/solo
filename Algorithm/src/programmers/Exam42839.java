package programmers;

import java.util.ArrayList;

public class Exam42839 {

	static ArrayList<Integer> tmp;

	public static void main(String[] args) {
		System.out.println(solution("17"));
		System.out.println(solution("22"));
		System.out.println(solution("011"));
		System.out.println(solution("0000000000"));
	}

	public static int solution(String numbers) {
		tmp = new ArrayList<>();
		for (int i = 0; i < numbers.length(); i++) {
			if (numbers.charAt(i) == '0') {
				add("", numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
			} else {
				add("" + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
				tmp.add(Integer.parseInt("" + numbers.charAt(i)));

			}
		}
		for (int i = 0; i < tmp.size(); i++) {
			if (tmp.get(i) == 1) {
				tmp.remove(i);
				i--;
			} else {
				for (int j = 0; j < tmp.size(); j++) {
					if (i == j) {

					} else {
						if (tmp.get(i) == tmp.get(j)) {
							tmp.remove(j);
							j--;
						}
					}
				}
			}
		}
		int answer = 0;
		for (int i = 0; i < tmp.size(); i++) {
			int flag = 1;
			int temp = tmp.get(i);
			if (temp == 2 || temp == 4) {
				flag = 0;
			}
			for (int j = 2; j <= (temp / 2); j++) {
				if (temp % j == 0) {
					flag = 0;
					break;
				}
			}
			answer = answer + flag;
		}
		return answer;
	}

	public static void add(String temp, String numbers) {
		if (numbers.length() == 0) {
			return;
		}

		for (int i = 0; i < numbers.length(); i++) {
			if (numbers.charAt(i) == '0' && temp.equals("")) {
				add("", numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
			} else {
				add(temp + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
				tmp.add(Integer.parseInt(temp + numbers.charAt(i)));
			}
		}

	}
}
