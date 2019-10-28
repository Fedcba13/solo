package programmers;

import java.util.Arrays;

public class Exam24937 {

	public static void main(String[] args) {
		System.out.println(solution(15, new int[] { 15, 5, 3, 7, 9, 14, 0 })); // 3
		System.out.println(solution(5, new int[] { 2, 5 })); // 2
		System.out.println(solution(100, new int[] { 50 })); // 2
	}

	public static int solution(int l, int[] v) {

		Arrays.sort(v);

		int answer = 0;

		int max = 0;

		if (v[0] != 0) {
			max = v[0] * 2;
		}

		if (v[v.length - 1] != l) {
			int temp = l - v[v.length - 1];
			if (max < temp) {
				max = temp * 2;
			}
		}

		for (int i = 0; i < v.length - 1; i++) {
			int temp = v[i + 1] - v[i];
			if (max < temp) {
				max = temp;
			}
		}

		if (max % 2 == 0) {
			answer = max / 2;
		} else {
			answer = (max / 2) + 1;
		}

		return answer;
	}

}
