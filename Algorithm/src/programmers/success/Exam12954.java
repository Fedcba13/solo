package programmers.success;

public class Exam12954 {

	public static void main(String[] args) {
		long[] tmp = solution(2, 5);
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ", ");
		}
		System.out.println();

		tmp = solution(4, 3);
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ", ");
		}
		System.out.println();

		tmp = solution(-4, 2);
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ", ");
		}
		System.out.println();

	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}
		return answer;
	}

}
