package programmers;

class Exam43162Temin {

	static int[][] temp1;
	static int[] temp2;

	public static void main(String[] args) {
		System.out.println(solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } }));
		System.out.println(solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } }));
		System.out.println(solution(5, new int[][] { { 1, 1, 0, 0, 1 }, { 1, 1, 1, 0, 0 }, { 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 1, 0 }, { 1, 0, 0, 0, 1 } }));
	}

	public static int solution(int n, int[][] computers) {
		int answer = 0;

		int[] asd = new int[n];
		temp2 = asd;
		temp1 = computers;

		int topindex = 0;
		int top = 0;

		for (int i = 0; i < n; i++) {
			int tempcnt = 0;
			for (int j = 0; j < n; j++) {
				if (temp1[i][j] == 1) {
					tempcnt++;
				}
			}
			if (top < tempcnt) {
				top = tempcnt;
				topindex = i;
			}
		}

		temp2 = temp1[topindex];
		answer = 1;
		for (int i = 0; i < n; i++) {
			if (temp2[i] == 0) {
				answer++;
				sol(i, answer);
			}
		}

		return answer;
	}

	public static void sol(int x, int y) {
		for (int i = 0; i < temp2.length; i++) {
			if(temp2[i] != 0) {
				continue;
			}
			if(temp1[x][i] == 1) {
				temp2[i] = y;
			}
		}
	}

}
