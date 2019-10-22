package programmers;

public class Exam12974 {

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 0, 1, 4, 4 }, { 3, 1, 5, 3 } }));
		System.out.println(solution(
				new int[][] { { 1, 1, 6, 5 }, { 2, 0, 4, 2 }, { 2, 4, 5, 7 }, { 4, 3, 8, 6 }, { 7, 5, 9, 7 } }));
	}

	public static long solution(int[][] rectangles) {

		int maxX = 0;
		int maxY = 0;

		for (int i = 0; i < rectangles.length; i++) {
			if (maxX < rectangles[i][2]) {
				maxX = rectangles[i][2];
			}
			if (maxY < rectangles[i][3]) {
				maxY = rectangles[i][3];
			}
		}

		int[][] arr = new int[maxX][maxY];

		for (int i = 0; i < rectangles.length; i++) {
			for (int j = rectangles[i][0]; j < rectangles[i][2]; j++) {
				for (int k = rectangles[i][1]; k < rectangles[i][3]; k++) {
					arr[j][k] = 1;
				}
			}
		}

		long answer = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == 1) {
					answer = answer + 1;
				}
			}
		}

		return answer;
	}

}
