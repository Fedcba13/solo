package baekjoon.success;

import java.util.Scanner;

public class Exam1002 {
	
	//https://www.acmicpc.net/problem/1002
	//외접 내접으로 풀었습니다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스 개수
		
		for(int i=0; i<T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			double distance = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)); // 두 x,y 좌표 사이의 거리

			System.out.println(distance + ", " + (r1+r2));
			if(x1 == x2 && y1==y2 && r1 == r2) {
				System.out.println(-1);
			}else if(Math.abs(r2-r1) < distance && distance < r2+r1) {
				System.out.println(2);
			}else if(r1+r2 == distance || Math.abs(r2-r1) == distance) {
				System.out.println(1);
			}else if(r1+r2 < distance || distance < Math.abs(r2-r1)) {
				System.out.println(0);
			}else {
				System.out.println(-1);
			}
			
		}
		
		sc.close();
	}

}
