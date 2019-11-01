package baekjoon.success;

import java.util.Scanner;

public class Exam10950 {
	
	//https://www.acmicpc.net/problem/10950
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스 수
		
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
		}
		
	}

}
