package programmers;

public class Test11576 {

	public static void main(String[] args) {
		int[] tmp = solution(new int[][] { { 1, 4 }, { 3, 4 }, { 3, 10 } });
		System.out.println(tmp[0] + " " + tmp[1]);

		tmp = solution(new int[][] { { 1, 1 }, { 2, 2 }, { 1, 2 } });
		System.out.println(tmp[0] + " " + tmp[1]);
	}

	public static int[] solution(int[][] v) {

		int x;
		int y;
		if (v[0][0] == v[1][0]) {
			x = v[2][0];
		} else if (v[0][0] == v[2][0]) {
			x = v[1][0];
		} else {
			x = v[0][0];
		}

		if (v[0][1] == v[1][1]) {
			y = v[2][1];
		} else if (v[0][1] == v[2][1]) {
			y = v[1][1];
		} else {
			y = v[0][1];
		}
		int[] answer = { x, y };

		return answer;
	}

}
