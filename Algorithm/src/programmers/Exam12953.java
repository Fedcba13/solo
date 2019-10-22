package programmers;

public class Exam12953 {

	public static void main(String args[]) {
		System.out.println(sol(new int[] { 5,10,14 }));
		System.out.println(sol(new int[] { 1, 2, 3 }));
	}

	public static int sol(int[] asd) {

		int result = 1;

		int div = 1;

		while (div != 0) {
			div++;
			int flag = 1;
			for (int i = 0; i < asd.length; i++) {
				if (asd[i] == 1) {
					flag = -1;
					break;
				}
				if (asd[i] < div) {
					flag = -1;
					break;
				}
				if (asd[i] % div != 0) {
					flag = 0;
					break;
				}
			}
			if (flag == -1) {
				break;
			}
			if (flag == 1) {
				result = result * div;
				for (int i = 0; i < asd.length; i++) {
					asd[i] = asd[i] / div;
				}
				div = 1;
			}

		}

		for (int i = 0; i < asd.length; i++) {
			result = result * asd[i];
		}

		return result;
	}

}
