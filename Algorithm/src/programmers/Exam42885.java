package programmers;

public class Exam42885 {

	public static void main(String args[]) {
		System.out.println(solution(new int[] { 70, 50, 80, 50 }, 100));
		System.out.println(solution(new int[] { 70, 80, 50 }, 100));
		System.out.println(solution(new int[] { 50, 50, 50 }, 100));
	}

	public static int solution(int[] people, int limit) {
		int change = 0;
		for (int i = 0; i < people.length - 1; i++) {
			change = 0;
			for (int j = 0; j < people.length - 1 - i; j++) {
				if (people[j] < people[j + 1]) {
					int temp = people[j];
					people[j] = people[j + 1];
					people[j + 1] = temp;
					change = 1;
				}
			}
			if (change == 0) {
				break;
			}
		}
		int findex = 0;
		int lindex = people.length - 1;

		int answer = 0;

		while (findex <= lindex) {
			if (findex == lindex) {
				answer++;
				break;
			}
			if (people[findex] + people[lindex] <= limit) {
				answer++;
				findex++;
				lindex--;

			} else if (people[findex] <= limit) {
				findex++;
				answer++;
			}
		}

		return answer;
	}

}
