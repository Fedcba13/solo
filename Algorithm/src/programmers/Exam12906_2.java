package programmers;

import java.util.Stack;

public class Exam12906_2 {
	
	public static void main(String[] args) {
		int[] result = new Exam12906_2().solution(new int[] {1,1,3,3,0,1,1});
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + "  ");
		}
		
		
		System.out.println();
		result = new Exam12906_2().solution(new int[] {4,4,4,3,3});
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + "  ");
		}
		
		
		System.out.println();
		result = new Exam12906_2().solution(new int[] {1,2,1,2,1,2});
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + "  ");
		}
		
		System.out.println();
		result = new Exam12906_2().solution(new int[] {1,1,1,1,1});
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + "  ");
		}
	}

	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			if(stack.empty() || stack.peek() != arr[i]) {
				stack.push(arr[i]);
			}
		}
		
		int[] answer = new int[stack.size()];
		
		for(int i = answer.length-1; i>=0; i--) {
			answer[i] = stack.pop();
		}

		return answer;
	}

}
