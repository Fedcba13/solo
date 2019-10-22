package baekjoon.success;

import java.util.Scanner;

public class Exam5622 {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		String eng[] = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

		String input = sc.nextLine();

		int answer = 0;

		for (int i = 0; i < input.length(); i++) {
			String tmp = input.charAt(i) + "";
			int index = 0;
			
			for(int j=0; j<eng.length; j++) {
				if(eng[j].indexOf(tmp) != -1) {
					index = j;
					break;
				}
			}
			
			answer = answer + 3 + index;



		}
		System.out.println(answer);
	}
}