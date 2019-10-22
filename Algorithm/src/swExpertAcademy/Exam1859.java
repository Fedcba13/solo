package swExpertAcademy;

import java.io.FileInputStream;
import java.util.Scanner;

class Exam1859 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= T; i++) {
			int sum = 0;
			int[] temp = new int[Integer.parseInt(sc.nextLine())];
			String[] asd = sc.nextLine().split("\\s");

			for (int j = 0; j < asd.length; j++) {
				temp[j] = Integer.parseInt(asd[j]);
			}

			int index = 0;
			while (index <= asd.length) {
				int max = 0;
				int maxindex = -1;
				for (int j = index; j < temp.length; j++) {
					if (max < temp[j]) {
						max = temp[j];
						maxindex = j;
					}
					if(max == 10000) {
						break;
					}
				}

				for (int j = index; j < maxindex; j++) {
					sum = sum + max - temp[j];
				}
				index = maxindex;
				if(index == -1) {
					index = asd.length;
				}
				index++;
			}

			System.out.println("#"+i+" " + sum);
		}
	}

}
