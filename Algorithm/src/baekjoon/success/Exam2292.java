package baekjoon.success;

import java.util.Scanner;

public class Exam2292 {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		
		input= input;
		
		int tmp = 1;
		int temp = 1;
		
		while(input != 1) {
			temp = temp + (6*tmp);
			tmp = tmp +1;
			if(input <= temp) {
				break;
			}
		}
		
		System.out.println(tmp);
	}
}