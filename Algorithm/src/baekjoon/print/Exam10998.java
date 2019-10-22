package baekjoon.print;

import java.util.Scanner;

public class Exam10998 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String T = sc.nextLine();
		
		String[] temp = T.split("\\s");
		
		int temp1 = Integer.parseInt(temp[0]);
		int temp2 = Integer.parseInt(temp[1]);
		
		System.out.println(temp1*temp2);

	}

}


