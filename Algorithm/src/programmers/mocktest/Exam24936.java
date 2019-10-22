package programmers.mocktest;

public class Exam24936 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 7, 8, 10 }, new int[] { 10, 7, 8 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1 }, new int[] { 5, 4, 1, 2 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1 }, new int[] { 4, 3, 2, 1 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1 }, new int[] { 3, 2, 1, 4 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1 }, new int[] { 2, 1, 4, 3 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1 }, new int[] { 1, 4, 3, 2 }));
		System.out.println(solution(new int[] { 3, 3, 3, 3 }, new int[] { 3, 3, 3 }));
	}

	public static boolean solution(int[] arrA, int[] arrB) {
		boolean answer = true;

		if (arrA.length != arrB.length) {
			return false;
		}

		int index = 0;
		while (index != arrB.length) {
			if (arrA[0] == arrB[index]) {
				break;
			} else {
				index++;
			}
		}

		for (int i = 0; i < arrA.length; i++) {
			int tmp = i + index;
			if (tmp >= arrB.length) {
				tmp = tmp - arrB.length;
				index = index - arrB.length;
			}
			if (arrA[i] != arrB[tmp]) {
				answer = false;
				break;
			}
		}

		return answer;
	}

}
