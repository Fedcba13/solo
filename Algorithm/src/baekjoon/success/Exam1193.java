package baekjoon.success;

import java.util.Scanner;

public class Exam1193 {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		// 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 1/3 1/4

		int input = sc.nextInt();

		int answer = 0;
		int temp = 0;

		while (input > answer) {
			temp = temp + 1;
			answer = answer + temp;
		}

		if (temp % 2 == 0) {
			System.out.println((temp + (input - answer)) + "/" + (answer - input + 1));
		} else {
			System.out.println((answer - input + 1) + "/" + (temp + (input - answer)));
		}
		
		sc.close();
	}
}