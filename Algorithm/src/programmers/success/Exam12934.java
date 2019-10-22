package programmers.success;

public class Exam12934 {
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(4));
		System.out.println(solution(3));
	}

	public static long solution(long n) {
		long answer = 0;
		long index = 2;
		int flag = 0;
		while (n >= (index * index)) {
			if (n == (index * index)) {
				flag = 1;
				break;
			} else {
				index = index + 1;
			}
		}
		if(n == 1) {
			return 4;
		}
		else if (flag == 0) {
			answer = -1;
		} else {
			answer = (index + 1) * (index + 1);
		}
		return answer;
	}
}
