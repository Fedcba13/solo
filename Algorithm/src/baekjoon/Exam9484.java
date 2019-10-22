package baekjoon;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam9484 {

	public static void main(String args[]) throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/baekjoon/input.txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int T = Integer.parseInt(sc.nextLine());
			ArrayList<int[]> temp = new ArrayList<int[]>();
			if (T == 0) {
				break;
			}
			for (int i = 0; i < T; i++) {
				String a = sc.nextLine();

				String[] b = a.split("\\s");

				temp.add(new int[] { Integer.parseInt(b[0]), Integer.parseInt(b[1]) });
			}
			float max = Math.abs((float)temp.get(0)[0] * temp.get(1)[1] + temp.get(1)[0] * temp.get(2)[1]
					+ temp.get(2)[0] * temp.get(0)[1] - temp.get(0)[0] * temp.get(2)[1]
					- temp.get(2)[0] * temp.get(1)[1] - temp.get(1)[0] * temp.get(0)[1]) / 2;
			float min = Math.abs((float)temp.get(0)[0] * temp.get(1)[1] + temp.get(1)[0] * temp.get(2)[1]
					+ temp.get(2)[0] * temp.get(0)[1] - temp.get(0)[0] * temp.get(2)[1]
					- temp.get(2)[0] * temp.get(1)[1] - temp.get(1)[0] * temp.get(0)[1]) / 2;

			for (int j = 0; j < T; j++) {
				for (int k = j + 1; k < T; k++) {
					for (int l = k + 1; l < T; l++) {
						
						float a = Math.abs((float)temp.get(j)[0] * temp.get(k)[1] + temp.get(k)[0] * temp.get(l)[1]
								+ temp.get(l)[0] * temp.get(j)[1] - temp.get(j)[0] * temp.get(l)[1]
								- temp.get(l)[0] * temp.get(k)[1] - temp.get(k)[0] * temp.get(j)[1]) / 2;
						if (a > max) {
							max = a;
						}
						if (a < min) {
							min = a;
						}
					}
				}
			}

			String max_string = String.format("%.1f", max);
			String min_string = String.format("%.1f", min);

			System.out.println(min_string + " " + max_string);

		}
	}

}
