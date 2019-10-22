package programmers;

public class Exam42885_2 {

	public static void main(String args[]) {
		System.out.println(solution(new int[] { 70, 50, 80, 50 }, 100));
		System.out.println(solution(new int[] { 70, 80, 50 }, 100));
		System.out.println(solution(new int[] { 50, 50, 50 }, 100));
	}

	public static int solution(int[] people, int limit) {
		int[] temp = new int[250];
		for (int i = 0; i < people.length; i++) {
			temp[people[i]]++;
		}

		int answer = 0;

		for (int i = temp.length - 1; i >= 0; i--) {
			int falge = 0;
			if (i == 50) {
				falge++;
			}
			if (temp[i] == 0) {

			} else {
				for (int j = limit - i; j >= 0; j--) {
					if (temp[j] == 0) {

					} else {
						if (i == j) {
							int min = temp[i] / 2;
							temp[i] = temp[i] - (min * 2);
							answer = answer + min;
						} else {
							int min = Math.min(temp[i], temp[j]);
							temp[i] = temp[i] - min;
							temp[j] = temp[j] - min;
							answer = answer + min;
						}
						if (temp[i] == 0) {
							break;
						}
					}
				}
				if (temp[i] != 0) {
					answer = answer + temp[i];
				}
			}
		}

		return answer;
	}

}
