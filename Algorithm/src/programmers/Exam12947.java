package programmers;

public class Exam12947 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
		System.out.println(solution(18));
	}

	public static boolean solution(int x) {
		boolean answer = true;
		int init = x;
		int length = (x + "").length();
		int add = 0;
		for (int i = length - 1; i >= 0; i--) {
			add = add + x / (int) Math.pow(10, i);
			x = x - (int) Math.pow(10, i) * (x / (int) Math.pow(10, i));
		}
		if(init % add == 0) {
			answer = true;
		}else {
			answer = false;
		}
		return answer;
	}

}
