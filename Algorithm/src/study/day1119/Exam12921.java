package study.day1119;

import java.util.stream.IntStream;

public class Exam12921 {

	public static void main(String[] args) {
		System.out.println(new Exam12921().solution(10));
		System.out.println(new Exam12921().solution(5));
	}

	public int solution(int n) {
		int[] arr = new int[n + 1];

		int cnt = 0;

		for (int i = 2; i <= n; i++) {
			if (arr[i] == 1) {
				continue;
			} else {
				cnt++;
				for (int j = i + i; j <= n; j += i) {
					arr[j] = 1;
				}
			}
		}

		return cnt;
	}
}
