package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int input = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= input; i++) {
			int order = Integer.parseInt(sc.nextLine());

			int tmp = 0, result = 0;

			for (int j = 0; j < order; j++) {
				if (tmp % 2 == 0) {
					tmp = tmp * (-1);
					tmp++;
					result = result + tmp;
					
				} else {
					tmp = tmp * (-1);
					tmp--;
					result = result + tmp;
				}

			}
			
			System.out.println("#"+i+" "+result);
			
		}

	}
}