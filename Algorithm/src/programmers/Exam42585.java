package programmers;

import java.util.Stack;

public class Exam42585 {

	public static void main(String[] args) {
		System.out.println(solution("(((())())((())))"));
		System.out.println(solution("()(((()())(())()))(())"));
	}

	public static int solution(String arrangement) {
		int answer = 0;
		Stack<String> stack = new Stack<String>();
		int flag = 0;
		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == ')') {
				if (flag == 1) {
					stack.pop();
					answer = answer + stack.size();
					flag = 0;
				} else {
					stack.pop();
					flag = 0;
					answer = answer + 1;
				}
			}
			if (arrangement.charAt(i) == '(') {
				stack.push("a");
				flag = 1;
			}
		}
		return answer;
	}

}
