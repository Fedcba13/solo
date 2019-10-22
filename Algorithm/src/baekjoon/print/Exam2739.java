package baekjoon.print;

import java.util.Scanner;

public class Exam2739 {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<10; i++) {
			System.out.println(T + " * " + i + " = " + (T*i));
		}

	}

}
