package swExpertAcademy;

import java.io.FileInputStream;
import java.util.Scanner;

public class Exam6900 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/swExpertAcademy/input.txt"));
		Scanner sc = new Scanner(System.in);
		String T = sc.nextLine();

		for (int cnt = 1; cnt <= Integer.parseInt(T); cnt++) {
			int answer = 0;
			String[] tmp = sc.nextLine().split("\\s");
			int N = Integer.parseInt(tmp[0]);
			int M = Integer.parseInt(tmp[1]);

			String[][] sad1 = new String[N][2];
			String[] sad2 = new String[M];

			for (int i = 0; i < N; i++) {
				tmp = sc.nextLine().split("\\s");
				sad1[i][0] = tmp[0];
				sad1[i][1] = tmp[1];
			}

			for (int i = 0; i < M; i++) {
				sad2[i] = sc.nextLine();
			}

			for (int i = 0; i < N; i++) {
				String temp1 = sad1[i][0];
				for (int j = 0; j < M; j++) {
					int flag = 1;
					String temp2 = sad2[j];
					if (temp2.equals("*")) {

					} else {

						for (int k = 0; k < temp1.length(); k++) {
							if (temp1.charAt(k) == '*') {

							} else {
								if (temp1.charAt(k) == temp2.charAt(k)) {

								} else {
									flag = 0;
									break;
								}
							}
						}

						if (flag == 1) {
							sad2[j] = "*";
							answer = answer + Integer.parseInt(sad1[i][1]);
						}
					}
				}
			}

			System.out.println("#" + cnt + " " + answer);

		}

	}
}
