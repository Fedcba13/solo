package baekjoon.success;

import java.util.Scanner;

public class Exam2941 {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		String alphabet[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		String input = sc.nextLine();
		int answer = 0;

		while (input.length() != 0) {
			
			for(int i=0; i<alphabet.length; i++) {
				if(input.indexOf(alphabet[i]) == 0) {
					answer = answer + 1;
					input = input.substring(alphabet[i].length());
					break;
				}
				if(i==alphabet.length-1) {
					answer = answer + 1;
					input = input.substring(1);
				}
			}
		}
		
		System.out.println(answer);
	}
}