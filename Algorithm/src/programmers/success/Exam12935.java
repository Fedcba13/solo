package programmers.success;

public class Exam12935 {

	public static void main(String[] args) {
		int[] temp = solution(new int[] { 4, 3, 2, 1 });
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();

		temp = solution(new int[] { 1, 2, 3, 4 });
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();

		temp = solution(new int[] { 1 });
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
	}

	public static int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[] { -1 };
		}
		int min = arr[0];
		int minindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minindex = i;
			}
		}

		int[] answer = new int[arr.length - 1];
		int index = 0;
		for (int i = 0; i < answer.length; i++) {
			if (index == minindex) {
				index++;
			}
			answer[i] = arr[index];
			index++;
		}
		return answer;
	}

}
