package programmers;

public class Exam14406 {

	public static void main(String[] args) {
		System.out.println(solution(4));
	}

	static long solution(int N) {
		long answer = 2;
		for (int i = 3; i <= N; i = i+2) {
			int cnt = 0;
			for (int j = 2; j < N; j++) {
				if (i == j) {

				} else {
					if (i % j == 0) {
						cnt = cnt + 1;
						break;
					}
				}
			}
			if (cnt == 0) {
				answer = answer + i;
			}
		}
		return answer;
	}
}
