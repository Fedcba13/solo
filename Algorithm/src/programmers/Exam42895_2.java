package programmers;

public class Exam42895_2 {

	static int answer = 0;

	public static void main(String[] args) {
		int a = solution(5, 2365);
		System.out.println(a);

	}

	public static int solution(int N, int number) {
		sol(N, number, 0, 0);
		return answer;
	}

	public static void sol(int N, int number, int cnt, int temp) {
		if (cnt > 8) {
			return;
		}
		if (temp == number) {
			if (cnt < answer || answer == 0) {
				answer = cnt;
				return;
			}
		}
		int n = 0;
		for (int i = 0; i < 8 - cnt; i++) {
			n = 10 * n + N;
			sol(N, number, cnt + 1 + i, temp + n);
			sol(N, number, cnt + 1 + i, temp - n);
			sol(N, number, cnt + 1 + i, temp * n);
			sol(N, number, cnt + 1 + i, temp / n);
		}
	}
}
