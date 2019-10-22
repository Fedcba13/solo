package success;

public class Exam42862 {

	public static void main(String[] args) {
		System.out.println(solution(6, new int[] { 3, 4, 5 }, new int[] { 4, 5, 6 }));
		System.out.println(solution(5, new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == 0) {
					break;
				}
				if (reserve[j] == 0) {
					continue;
				}
				if (lost[i] == reserve[j]) {
					lost[i] = 0;
					reserve[j] = 0;
					break;
				}
			}
		}
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == 0) {
					break;
				}
				if (reserve[j] == 0) {
					continue;
				}
				if (Math.abs(lost[i] - reserve[j]) == 1) {
					lost[i] = 0;
					reserve[j] = 0;
				}
			}
		}
		for (int i = 0; i < lost.length; i++) {
			if (lost[i] != 0) {
				answer = answer - 1;
			}
		}
		return answer;
	}

}
