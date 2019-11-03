package programmers;

public class Exam12906_1 {

	public int[] solution(int[] arr) {
		int cnt = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[index]) {
				index = i;
				cnt = cnt + 1;
			}
		}

		int[] answer = new int[cnt + 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = -1;
		}
		index = 0;
		answer[0] = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != answer[index]) {
				index = index + 1;
				answer[index] = arr[i];
			}
		}

		return answer;
	}

}
