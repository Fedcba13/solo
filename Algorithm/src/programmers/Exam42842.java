package programmers;

public class Exam42842 {

	public static void main(String[] args) {
		int[] temp = solution(10, 2);
		System.out.println(temp[0] + ", " + temp[1]);

		temp = solution(8, 1);
		System.out.println(temp[0] + ", " + temp[1]);

		temp = solution(24, 24);
		System.out.println(temp[0] + ", " + temp[1]);

	}

	public static int[] solution(int brown, int red) {
		int hap = brown + red;
		int x = 3;
		int y = 3;
		while (true) {
			if (x < y) {
				x = x + 1;
				y = 3;
			}
			if (x * y == hap) {
				if ((x * y - red) == brown && (x - 2) * (y - 2) == red) {
					break;
				} else {
					y = y + 1;
				}
			} else if (x * y > hap) {
				x = x + 1;
				y = 3;
			} else {
				y = y + 1;
			}

		}
		int[] answer = { x, y };
		return answer;
	}

}
