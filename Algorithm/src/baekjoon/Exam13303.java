package baekjoon;

import java.util.HashMap;

public class Exam13303 {

	static int answer;
	static HashMap<Integer, Integer> hash;

	public static void main(String[] args) {
		System.out.println(solution(13, 5, new int[] { 4, 6, 7, 11, 12 }));
		System.out.println(solution(50, 10, new int[] { 3, 5, 7, 11, 15, 16, 22, 23, 24, 34 }));
	}

	public static int solution(int N, int M, int[] day) {

		answer = 0;
		hash = new HashMap<>();

		for (int i = 0; i < day.length; i++) {
			hash.put(day[i], day[i]);
		}

		sol(N, 1, 0, 0, 0, 0);

		return answer;
	}

	public static void sol(int N, int index, int day5, int day3, int day1, int coupon) {

		if (N+1 == index) {
			int temp = (day5 * 37000) + (day3 * 25000) + (day1 * 10000);
			if (answer == 0) {
				answer = temp;
			} else {
				if (answer > temp) {
					answer = temp;
				}
			}
			return;
		}

		if (hash.containsKey(index)) {
			sol(N, index + 1, day5, day3, day1, coupon);
		} else {
			if ((N - index + 1) >= 5) {
				sol(N, index + 5, day5 + 1, day3, day1, coupon + 2);
				sol(N, index + 3, day5, day3 + 1, day1, coupon + 1);
				if (coupon >= 3) {
					sol(N, index + 1, day5, day3, day1, coupon - 3);
				} else {
					sol(N, index + 1, day5, day3, day1 + 1, coupon);
				}

			} else if ((N - index + 1) >= 3) {
				sol(N, index + 3, day5, day3 + 1, day1, coupon + 1);
				if (coupon >= 3) {
					sol(N, index + 1, day5, day3, day1, coupon - 3);
				} else {
					sol(N, index + 1, day5, day3, day1 + 1, coupon);
				}
			} else {
				if (coupon >= 3) {
					sol(N, index + 1, day5, day3, day1, coupon - 3);
				} else {
					sol(N, index + 1, day5, day3, day1 + 1, coupon);
				}
			}
		}
	}

}
