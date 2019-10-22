package baekjoon.print;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam1932 {

	static ArrayList<int[]> v = new ArrayList<int[]>();
	static int answer = 0;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("src/baekjoon/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < T; i++) {
			int[] temp = new int[i + 1];

			String a = sc.nextLine();
			String b[] = a.split("\\s");

			for (int j = 0; j < i + 1; j++) {
				temp[j] = Integer.parseInt(b[j]);
			}

			v.add(temp);
		}
		
		solve(v.get(0)[0], 0, 0, T);
		
		System.out.println(answer);

	}

	public static void solve(int now, int level, int i, int depth) {
		
		if (level == depth - 1) {
			if(answer < now) {
				answer = now;
			}
			return;
		}
		
		solve(now+v.get(level+1)[i], level+1, i, depth);
		solve(now+v.get(level+1)[i+1], level+1, i+1, depth);

	}

}
