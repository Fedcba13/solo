package programmers.mocktest;

import java.util.HashMap;

public class Exam24938 {

	public static void main(String[] args) {
		System.out
				.println(solution(new int[][] { { 11, 13, 15, 16 }, { 12, 1, 4, 3 }, { 10, 2, 7, 8 }, { 5, 14, 6, 9 } },
						new int[] { 14, 3, 2, 4, 13, 1, 16, 11, 5, 15 }));
		// 3
		System.out
				.println(solution(
						new int[][] { { 6, 15, 17, 14, 23 }, { 5, 12, 16, 13, 25 }, { 21, 4, 2, 1, 22 },
								{ 10, 20, 3, 18, 8 }, { 11, 9, 19, 24, 7 } },
						new int[] { 15, 7, 2, 25, 9, 16, 12, 18, 5, 4, 10, 13, 20 }));
		// 2
	}

	public static int solution(int[][] board, int[] nums) {
		int answer = 0;

		int N = board.length;

		HashMap<Integer, Integer> numbers = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			numbers.put(nums[i], i);
		}
		int flag = 1;

		for (int i = 0; i < N; i++) {
			flag = 1;
			for (int j = 0; j < N; j++) {
				if (numbers.get(board[i][j]) == null) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				answer++;
			}
		}

		for (int i = 0; i < N; i++) {
			flag = 1;
			for (int j = 0; j < N; j++) {
				if (numbers.get(board[j][i]) == null) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				answer++;
			}
		}
		flag = 1;
		for (int i = 0; i < N; i++) {
			if (numbers.get(board[i][i]) == null) {
				flag = 0;
				break;
			}
		}

		if (flag == 1) {
			answer++;
		}

		flag = 1;
		for (int i = 0; i < N; i++) {
			if (numbers.get(board[i][N - 1 - i]) == null) {
				flag = 0;
				break;
			}
		}

		if (flag == 1) {
			answer++;
		}
		return answer;
	}

}
