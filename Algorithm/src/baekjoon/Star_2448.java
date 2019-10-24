package baekjoon;

import java.util.Scanner;

public class Star_2448 {

	static int[][] answer;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int scan = sc.nextInt();
		int save = scan;

		answer = new int[scan + 1][scan * 2];

		answer[1][scan] = 1;
		answer[2][scan + 1] = answer[2][scan - 1] = 1;
		answer[3][scan - 2] = answer[3][scan - 1] = answer[3][scan] = answer[3][scan + 1] = answer[3][scan + 2] = 1;

		int x = 5;
		int y = 3;

		scan = scan / 3;

		int level = 1;
		while (scan != 1) {
			if (scan / 2 >= 1) {
				level++;
				scan = scan / 2;
			}
		}

		star(save, 3, 0);

		for (int i = 1; i < answer.length; i++) {
			for (int j = 1; j < answer[0].length; j++) {
				if (answer[i][j] == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void star(int a, int tmp, int level) {
		if (a == tmp) {
			return;
		}

		int start, end;
		if (level == 0) {
			start = a-2;
			end = a+2;
		} else {

			start = (int) (a - (5 * Math.pow(2, level-1) +level -1));
			end = (int) (a+(5 * Math.pow(2, level-1) +level -1));
		}		

		int[][] tmpArr = new int[tmp][end - start + 1];

		for (int i = 0; i < tmpArr.length; i++) {
			for (int j = 0; j < tmpArr[0].length; j++) {
				tmpArr[i][j] = answer[i + 1][j + start];
			}
		}

		for (int i = 0; i < tmpArr.length; i++) {
			for (int j = 0; j < tmpArr[0].length; j++) {
				if (tmpArr[i][j] == 1) {
					answer[i + tmp + 1][start - tmp + j] = tmpArr[i][j];
				}
			}
		}

		for (int i = 0; i < tmpArr.length; i++) {
			for (int j = 0; j < tmpArr[0].length; j++) {
				if (tmpArr[i][j] == 1) {
					answer[i + tmp + 1][end - tmp + 2 + j] = tmpArr[i][j];
				}
			}
		}

		star(a, tmp * 2, level + 1);
	}
}