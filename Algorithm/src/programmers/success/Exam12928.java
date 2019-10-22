package programmers.success;

public class Exam12928 {

	public static void main(String[] args) {
		System.out.println(solution(4));
		System.out.println(solution(12));
		System.out.println(solution(3000));
	}

	public static int solution(int n) {
		int answer = 0;
		int i = 1;
		int mok = n;
		while (i <= mok) {
			mok = n / i;
			if (n % i == 0) {
				if (i == mok) {
					answer = answer + i;
				} else {
					answer = answer + i + mok;
				}
			}
			i++;
			mok = n / i;
		}
		return answer;
	}

}
