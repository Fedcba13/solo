package programmers.success;

public class Exam12982 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 2, 5, 4 }, 9));
		System.out.println(solution(new int[] { 2, 2, 3, 3 }, 10));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;
		for (int i = 0; i < d.length - 1; i++) {
			for (int j = 0; j < d.length - i - 1; j++) {
				if (d[j] > d[j + 1]) {
					int temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		int index = 0;
		while (budget > 0) {
			if (d.length == index) {
				break;
			}
			if (d[index] <= budget) {
				budget = budget - d[index];
				answer++;
				index++;
			} else {
				break;
			}
		}
		return answer;
	}

}
