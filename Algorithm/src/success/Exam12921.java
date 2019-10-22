package success;

public class Exam12921 {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}

	public static int solution(int n) {
		int answer = 0;
		int[] temp = new int[n+1];
		for (int i = 2; i <= n; i++) {
			temp[i] = i;
		}
		for (int i = 2; i <= n; i++) {
			if (temp[i] == 0) {
				continue;
			}
			for (int j = i + i; j <= n; j = j + i) {
				temp[j] = 0;
			}
			answer = answer + 1;
		}
		return answer;
	}
}
