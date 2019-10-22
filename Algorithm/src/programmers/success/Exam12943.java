package programmers.success;

public class Exam12943 {

	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
	}

	public static int solution(int num) {
		long temp = num + 0l;
		int answer = 0;
		while (temp != 1) {
			if (temp % 2 == 0) {
				temp = temp / 2;
				answer++;
			} else {
				temp = (temp * 3) + 1;
				answer++;
			}
			if (answer >= 500) {
				answer = -1;
				break;
			}
		}
		return answer;
	}

}
