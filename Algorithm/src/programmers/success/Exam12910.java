package programmers.success;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam12910 {

	public static void main(String[] args) {
		int[] temp = solution(new int[] { 5, 9, 7, 10 }, 5);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		temp = solution(new int[] { 2, 36, 1, 3 }, 1);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		temp = solution(new int[] { 3, 2, 6 }, 5);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
	}

	public static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				temp.add(arr[i]);
			}
		}
		if(temp.size() == 0) {
			return new int[] {-1};
		}
		int[] answer = new int[temp.size()];
		for(int i=0; i<temp.size();i++) {
			answer[i] = temp.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}

}
