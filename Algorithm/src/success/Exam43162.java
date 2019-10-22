package success;
/*ÅÂ¹ÎÀÌ²¨ ÀÌÇØ ¸øÇÔ*/
public class Exam43162 {

	static int[][] temp1;
	static int[] temp2;

	public static void main(String[] args) {
		
		System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
		System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
		System.out.println(solution(5, new int[][] {{1, 1, 0, 0, 1}, {1, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 1, 0}, {1, 0, 0, 0, 1}}));
	}

	public static int solution(int n, int[][] computers) {
		int answer = 0;

		temp1 = computers;

		int[] asd = new int[n];
		temp2 = asd;

		for (int i = 0; i < computers.length; i++) {
			if (temp2[i] == 0) {
				answer++;
				sol(i, answer);
			}
		}
		return answer;
	}

	public static void sol(int x, int index) {
		for (int i = 0; i < temp1.length; i++) {
			if (temp1[x][i] == 1) {
				temp2[i] = index;
				temp1[x][i] = 0;
				sol(i, index);
			}
		}
	}

}
