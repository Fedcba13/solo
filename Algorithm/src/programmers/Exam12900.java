package programmers;

public class Exam12900 {

	public static void main(String[] args) {
			System.out.println(solution(60000)); // 977243956
	}

	public static int solution(int n) {
		long answer = 0l;
		long preNum = 0l;
		long prepreNum = 0l;
		if (n == 1) {
			answer = 1l;
		} else {
			answer = 2l;
			preNum = 2l;
			prepreNum = 1l;
		}
		for (int i = 2; i < n; i++) {
			answer = answer + prepreNum;
			prepreNum = preNum;
			preNum = answer;
		}
		return (int) (answer % 1000000007);
	}

}
