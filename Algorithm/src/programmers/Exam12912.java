package programmers;

public class Exam12912 {
	
	public static void main(String[] args) {
		System.out.println(new Exam12912().solution(3, 5));
		System.out.println(new Exam12912().solution(3, 3));
		System.out.println(new Exam12912().solution(5, 3));
		System.out.println(new Exam12912().solution(-10000000, 10000000));
		System.out.println(new Exam12912().solution(10000000, -10000000));
	}

	public long solution(int a, int b) {
		long answer = 0;
		for(int i=(a<b? a : b) ; i<= (a<b ? b: a); i++) {
			answer += i;
		}
		return answer;
	}

}
