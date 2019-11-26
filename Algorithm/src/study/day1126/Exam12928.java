package study.day1126;

public class Exam12928 {

	public static void main(String[] args) {
		System.out.println(new Exam12928().solution(4));
		System.out.println(new Exam12928().solution(12));
		System.out.println(new Exam12928().solution(3000));
	}

	public int solution2(int n) {
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

	public int solution(int n) {
		int answer = 0;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				answer += i;
				answer += (n/i);
				if(i == Math.sqrt(n)) {
					answer -= i;
				}
			}
		}
		return answer;
	}

}
