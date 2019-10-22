package programmers.success;

public class Exam12944 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {5,5}));
	}

	public static double solution(int[] arr) {
		double answer = 0;
		for(int i=0; i<arr.length;i++) {
			answer = answer + arr[i];
		}
		answer = answer / arr.length;
		return answer;
	}
}
