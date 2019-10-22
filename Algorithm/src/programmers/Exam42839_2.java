package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam42839_2 {

	static ArrayList<Integer> list;
	static HashMap<String, String> hash;

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(solution(""+i)); // 3	
		}
		
		System.out.println(solution("17")); // 3
		System.out.println(solution("22")); // 0
		System.out.println(solution("011")); // 2
		System.out.println(solution("11011")); // 2
		System.out.println(solution("0123")); // 2
		System.out.println(solution("1234567")); // 1
	}

	public static int solution(String numbers) {
		
		int answer = 0;

		list = new ArrayList<>();
		hash = new HashMap<>();

		for (int i = 0; i < numbers.length(); i++) {
			String temp = numbers.charAt(i) + "";
			if (temp.equals("0")) {
				add("", numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
			} else {
				add(temp, numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
				if (!hash.containsKey(temp)) {
					hash.put(temp, "");
					list.add(Integer.parseInt(temp));
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			int flag = 1;
			if (temp == 1) {
				flag = 0;
			}
			for (int j = 2; j < (temp - 1); j++) {
				if(temp % j == 0) {
					flag = 0;
					break;
				}
			}
			answer = answer + flag;
		}

	return answer;

	}

	public static void add(String tmp, String numbers) {
		if (numbers.length() == 0) {
			return;
		}

		for (int i = 0; i < numbers.length(); i++) {
			String temp = tmp + numbers.charAt(i);
			if (temp.equals("0")) {
				add("", numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
			} else {
				add(temp, numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
				if (!hash.containsKey(temp)) {
					hash.put(temp, "");
					list.add(Integer.parseInt(temp));
				}
			}
		}

	}
}