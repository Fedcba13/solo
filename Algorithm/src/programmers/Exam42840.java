package programmers;

public class Exam42840 {

	public static void main(String[] args) {
		int[] temp = solution(new int[] { 1, 2, 3, 4, 5 });
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		temp = solution(new int[] { 1, 3, 2, 4, 2 });
		
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

	public static int[] solution(int[] answers) {

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] b1 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c1 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int a2 = 0, b2 = 0, c2 = 0;
		for (int i = 0; i < answers.length; i++) {
			int temp = answers[i];
			if (a1[i % a1.length] == temp) {
				a2++;
			}
			if (b1[i % b1.length] == temp) {
				b2++;
			}
			if (c1[i % c1.length] == temp) {
				c2++;
			}
		}
		int max = a2 > b2 ? a2 : b2;
		max = max > c2 ? max : c2;
		int cnt = 0;
		if (a2 == max) {
			cnt = cnt + 1;
		}
		if (b2 == max) {
			cnt = cnt + 1;
		}
		if (c2 == max) {
			cnt = cnt + 1;
		}
		int[] answer = new int[cnt];
		int index = 0;
		if (a2 == max) {
			answer[index] = 1;
			index++;
		}
		if (b2 == max) {
			answer[index] = 2;
			index++;
		}
		if (c2 == max) {
			answer[index] = 3;
			index++;
		}
		return answer;
	}

}
