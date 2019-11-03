package programmers;

public class Exam12940 {
	public static void main(String[] args) {
		int[] answer = solution(3, 12);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();

		answer = solution(2, 5);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();

		answer = solution(2, 4);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
	}

	public static int[] solution(int n, int m) {
		int[] answer = { 1, 1 };
		int index = 2;
		while (n != 1 && m != 1 && n >= index && m >= index) {
			if (n % index == 0 && m % index == 0) {
				n = n / index;
				m = m / index;
				answer[0] = answer[0] * index;
			} else {
				index++;
			}

		}
		answer[1] = answer[0] * n * m;
		return answer;
	}
}
