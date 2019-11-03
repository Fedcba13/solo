package programmers;

import java.util.ArrayList;

public class Exam12973 {

	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
		System.out.println(solution("cdcd"));
	}

	public static int solution(String s) {
		ArrayList<String> temp = new ArrayList<>();
		int flag = -1;
		for (int i = 0; i < s.length(); i++) {
			flag++;
			temp.add(s.charAt(i) + "");
			if(flag>=1 && temp.get(flag).equals(temp.get(flag-1))) {
				temp.remove(flag-1);
				temp.remove(flag-1);
				if(flag >= 2) {
					flag = flag-2;
				}else {
					flag = -1;
				}
			}
		}
		int answer = 0;

		if (temp.size() == 0) {
			answer = 1;
		}
		return answer;
	}

}
