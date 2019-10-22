package programmers;

public class ExamTaemin01 {
	
	static int answer = 0;

	public static void main(String[] args) {
		int[][] a = new int[][] { { 10, 9 }, { 2, 0, 1, 0, 0, 0, 1, 0, 0 }, { 1, 2, 8, 7, 1, 3, 1, 1, 2, 5 } };
		int[][] b = new int[][] { { 10, 3 }, { 2, 2, 2 }, { 1, 1, 2, 2, 3, 1, 1, 2, 3, 3 } };
		int[][] c = new int[][] { { 3, 3 }, { 3, 0, 0 }, { 1, 2, 3 } };
		sol(a);
		sol(b);
		sol(c);
	}

	public static void sol(int[][] s) {
		answer = 0;
		int length = 0;
		for (int i = 0; i < s[1].length; i++) {
			length = length + s[1][i];
		}
		for (int i = 0; i < s[2].length - length; i++) {
			int[] tmp = new int[length];
			int index = 0;
			for (int j = i; j < i + length; j++) {
				tmp[index] = s[2][j];
				index++;
			}
			asd(i, tmp, s[0][1], s[1]);
			if(answer != 0) {
				break;
			}
		}
		System.out.println(answer);
	}

	public static void asd(int start, int[] s, int length, int[] v) {
		if(answer != 0) {
			return;
		}
		int[] tmp = new int[length];
		for(int i=0; i<s.length;i++) {
			tmp[s[i]-1]++;
		}
		for(int i=0; i<v.length;i++) {
			if(v[i] != tmp[i]) {
				return;
			}
		}
		answer = start+1;
	}

}
