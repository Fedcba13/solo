package programmers.success;

public class Exam12932 {

	public static void main(String[] args) {

		int answer[] = solution(12345);

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}

	}

	public static int[] solution(long n) {
		String temp = n + "";
		int[] answer = new int[temp.length()];
		int index = 0;
		for (int i = temp.length() - 1; i >= 0; i--) {
			answer[index] = Integer.parseInt(temp.charAt(i)+"");
			index++;
		}
		return answer;
	}

}
